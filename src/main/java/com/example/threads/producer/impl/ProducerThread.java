package com.example.threads.producer.impl;

import com.example.domain.MessageWrapper;
import com.example.domain.MonitorProcessConfig;
import com.example.domain.ProducerResponse;
import com.example.domain.ProducerWrapper;
import com.example.threads.producer.ProducerThreadInterface;
import com.example.workers.producer.ProducerInterface;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.springframework.stereotype.Service;

@Service
public class ProducerThread implements ProducerThreadInterface<ProducerInterface> {

    @Override
    public Future<ProducerResponse> startThread(String contextId,
                                                ConcurrentLinkedQueue<MessageWrapper> queue,
                                                ProducerInterface producer,
                                                MonitorProcessConfig config) {

        System.out.println(contextId + " Starting producer: " + producer.getProcessName());

        ProducerWrapper producerWrapper = ProducerWrapper.builder()
            .contexId(contextId)
            .queue(queue)
            .build();

        ExecutorService executorService = Executors.newFixedThreadPool(config.getProducerThreadPool());

        Future<ProducerResponse> future = executorService.submit(() -> producer.execute(producerWrapper));

        return future;
    }

}
