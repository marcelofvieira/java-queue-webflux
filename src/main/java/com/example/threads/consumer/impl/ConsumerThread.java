package com.example.threads.consumer.impl;

import com.example.ScopedSingleton;
import com.example.domain.Debit;
import com.example.repository.MockDebitRepository;
import com.example.threads.consumer.ConsumerThreadInterface;
import com.example.workers.consumer.ConsumerWorkerInterface;
import com.example.workers.reader.ReaderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class ConsumerThread implements ConsumerThreadInterface<ConsumerWorkerInterface> {

    @Override
    public void execute(String context, ConcurrentLinkedQueue<Debit> queue, ConsumerWorkerInterface consumer) {

        System.out.println("Starting consumer: " + consumer.getReaderName() + " " + context);

        ScopedSingleton control = ScopedSingleton.getInstance(context);


    }
}
