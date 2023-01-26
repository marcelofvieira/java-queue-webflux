package com.example.threads.consumer.impl;

import com.example.ScopedSingleton;
import com.example.domain.ConsumerResponse;
import com.example.domain.ConsumerWrapper;
import com.example.domain.MessageWrapper;
import com.example.domain.MonitorProcessConfig;
import com.example.threads.consumer.ConsumerThreadInterface;
import com.example.workers.consumer.ConsumerInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.springframework.stereotype.Service;

@Service
public class ConsumerThread implements ConsumerThreadInterface<ConsumerInterface> {

    @Override
    public List<Future<ConsumerResponse>> startThread(String contextId,
                                                      ConcurrentLinkedQueue<MessageWrapper> queue,
                                                      ConsumerInterface consumer,
                                                      MonitorProcessConfig config) {

        List<Future<ConsumerResponse>> futureList = new ArrayList<>();

        System.out.println(contextId + " Starting process: " + consumer.getProcessName());

        ScopedSingleton control = ScopedSingleton.getInstance(contextId);

        ExecutorService executorService = Executors.newFixedThreadPool(config.getConsumerThreadPool());

        for (int i = 1; i < config.getConsumerThreadPool() + 1; i++) {
            ConsumerWrapper producerWrapper = ConsumerWrapper.builder().name("T" + i).contexId(contextId).queue(queue).build();

            futureList.add(executorService.submit(() -> consumer.execute(producerWrapper)));
        }

        return futureList;
    }

}
