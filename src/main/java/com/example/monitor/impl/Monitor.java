package com.example.monitor.impl;

import com.example.ScopedSingleton;
import com.example.domain.MessageWrapper;
import com.example.domain.MonitorProcessConfig;
import com.example.enums.ConfigMonitorEnum;
import com.example.exceptions.InvalidConfigException;
import com.example.factory.impl.ConfigFactory;
import com.example.monitor.MonitorInterface;
import com.example.threads.consumer.ConsumerThreadInterface;
import com.example.threads.producer.ProducerThreadInterface;
import com.example.workers.consumer.ConsumerInterface;
import com.example.workers.producer.ProducerInterface;
import java.util.List;
import java.util.Objects;
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

        System.out.println(contextId + " Monitor: Starting Monitor " + this.monitorName);

        System.out.println(contextId + " Monitor: "+ this.monitorName + " Getting Config [" + configName + "]");

        MonitorProcessConfig config = new ConfigFactory().get(ConfigMonitorEnum.getByName(configName));

        if (Objects.isNull(config)) {

            System.out.println(contextId + " Monitor: " + this.monitorName + " invalid configuration name!");
            System.out.println(contextId + " Monitor: Finishing monitor " + this.monitorName);

            throw new InvalidConfigException("Invalid configuration name");
        }

        ScopedSingleton control = ScopedSingleton.getInstance(contextId);

        ConcurrentLinkedQueue<MessageWrapper> queue = getNewQueue();

        //Starting producer = return future
        Future futureP = producerThread.startThread(contextId, queue, this.producer, config);

        //Starting consumer = return future
        List<Future> futureC = consumerThread.startThread(contextId, queue, this.consumer, config);

        try {

            while(!allProcessIsDone(futureP, futureC)){
                Thread.sleep(500);
                System.out.println(contextId + " Monitor: " + this.monitorName + " Checking threads is done...");
            }

        } catch (Exception e) {
        }

        ScopedSingleton.dropInstance(contextId);

        System.out.println(contextId + " Monitor: " + this.monitorName + " was finished!");

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
