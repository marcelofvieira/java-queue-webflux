package com.example.worker.processor.impl;

import com.example.worker.processor.AbstractProcessor;
import com.example.worker.processor.ProcessorInterface;
import org.springframework.stereotype.Service;

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
    public void executeProcessor(String s) {

        System.out.println("Processor " + getProcessorName() + ": " + s);
    }

}
