package com.example.threads.consumer.impl;

import com.example.ScopedSingleton;
import com.example.domain.ConsumerResponse;
import com.example.domain.ConsumerWrapper;
import com.example.domain.MessageWrapper;
import com.example.threads.consumer.ConsumerThreadInterface;
import com.example.workers.consumer.ConsumerInterface;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.springframework.stereotype.Service;

@Service
public class ConsumerThread implements ConsumerThreadInterface<ConsumerInterface> {

    @Override
    public Future<ConsumerResponse> startThread(String contextId, ConcurrentLinkedQueue<MessageWrapper> queue, ConsumerInterface consumer) {

        System.out.println(contextId + " Starting process: " + consumer.getProcessName());

        ScopedSingleton control = ScopedSingleton.getInstance(contextId);

        ConsumerWrapper producerWrapper = ConsumerWrapper.builder()
            .contexId(contextId)
            .queue(queue)
            .build();

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<ConsumerResponse> future = executorService.submit(() -> consumer.execute(producerWrapper));

        return future;

    }
}
