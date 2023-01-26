package com.example.monitor.impl;

import com.example.ScopedSingleton;
import com.example.domain.MessageWrapper;
import com.example.monitor.MonitorInterface;
import com.example.threads.consumer.ConsumerThreadInterface;
import com.example.threads.producer.ProducerThreadInterface;
import com.example.workers.consumer.ConsumerInterface;
import com.example.workers.producer.ProducerInterface;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Monitor implements MonitorInterface {

    private String monitorName;
    private final ProducerInterface producer;
    private final ConsumerInterface consumer;

    @Autowired
    private ProducerThreadInterface producerThread;

    @Autowired
    private ConsumerThreadInterface consumerThread;

    @Autowired
    public Monitor(ProducerInterface producer, ConsumerInterface consumer) {
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void setMonitorName(String name) {
        this.monitorName = name;
    }

    @Override
    public void start(String configName) {

        String contextId = getNewContextId();

        System.out.println(contextId + " Starting Monitor " + this.monitorName);

        ScopedSingleton control = ScopedSingleton.getInstance(contextId);

        ConcurrentLinkedQueue<MessageWrapper> queue = getNewQueue();

        //Starting producer = return future
        Future futureP = producerThread.startThread(contextId, queue, this.producer);

        //Starting consumer = return future
        List<Future> futureC = consumerThread.startThread(contextId, queue, this.consumer);

        try {

            while(!allProcessIsDone(futureP, futureC)){
                Thread.sleep(500);
                System.out.println(contextId + " Checking threads is done...");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        ScopedSingleton.dropInstance(contextId);

        System.out.println(contextId + " Finishing Monitor " + this.monitorName);

    }

    private ConcurrentLinkedQueue<MessageWrapper> getNewQueue() {
        return new ConcurrentLinkedQueue<MessageWrapper>();
    }

    private String getNewContextId() {
        return UUID.randomUUID().toString();
    }

    private boolean allProcessIsDone(Future futureProducer, List<Future> listFutureConsumer) {

        if (!futureProducer.isDone()) {
            return false;
        }

        if (listFutureConsumer.stream().filter(i -> !i.isDone()).collect(Collectors.toList()).size() > 0) {
            return false;
        }

        return true;
    }

}
