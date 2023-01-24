package com.example.threads.consumer.impl;

import com.example.ScopedSingleton;
import com.example.domain.Debit;
import com.example.threads.consumer.ConsumerThreadInterface;
import com.example.workers.consumer.ConsumerWorkerInterface;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.springframework.stereotype.Service;

@Service
public class ConsumerThread implements ConsumerThreadInterface<ConsumerWorkerInterface> {

    @Override
    public void execute(String context, ConcurrentLinkedQueue<Debit> queue, ConsumerWorkerInterface consumer) {

        System.out.println("Starting consumer: " + consumer.getReaderName() + " " + context);

        ScopedSingleton control = ScopedSingleton.getInstance(context);


    }
}
