package com.example.worker.processor.impl;

import com.example.domain.Debit;
import com.example.worker.processor.AbstractProcessor;
import com.example.worker.processor.ProcessorInterface;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedTransferQueue;

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
