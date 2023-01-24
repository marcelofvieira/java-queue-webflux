package com.example.workers.processor.impl;

import com.example.domain.Debit;
import com.example.workers.processor.AbstractProcessor;
import com.example.workers.processor.ProcessorInterface;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class Processor02 extends AbstractProcessor {

    public Processor02() {
        setProcessorName("PROCESSOR 02");
    }

    @Override
    public ProcessorInterface getNewInstance() {
        return new Processor02();
    }

    @Override
    public void executeProcessor(String scope, ConcurrentLinkedQueue<Debit> queue) {

        System.out.println("Processor " + getProcessorName());



    }

}
