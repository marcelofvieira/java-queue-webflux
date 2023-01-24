package com.example.threads.consumer.impl;

import com.example.ScopedSingleton;
import com.example.domain.ConsumerResponse;
import com.example.domain.ConsumerWrapper;
import com.example.domain.MessageWrapper;
import com.example.threads.consumer.ConsumerThreadInterface;
import com.example.workers.consumer.ConsumerInterface;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.springframework.stereotype.Service;

@Service
public class ConsumerThread implements ConsumerThreadInterface<ConsumerInterface> {

    @Override
    public List<Future<ConsumerResponse>> startThread(String contextId, ConcurrentLinkedQueue<MessageWrapper> queue,
                                                      ConsumerInterface consumer) {

        System.out.println(contextId + " Starting process: " + consumer.getProcessName());

        ScopedSingleton control = ScopedSingleton.getInstance(contextId);

        ConsumerWrapper producerWrapper1 = ConsumerWrapper.builder().name("T1").contexId(contextId).queue(queue).build();
        ConsumerWrapper producerWrapper2 = ConsumerWrapper.builder().name("T2").contexId(contextId).queue(queue).build();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<ConsumerResponse> future1 = executorService.submit(() -> consumer.execute(producerWrapper1));
        Future<ConsumerResponse> future2 = executorService.submit(() -> consumer.execute(producerWrapper2));

        return List.of(future1, future2);
    }

}
