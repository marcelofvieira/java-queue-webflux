package com.example.worker.processor.impl;

import com.example.worker.processor.AbstractProcessor;
import com.example.worker.processor.ProcessorInterface;
import org.springframework.stereotype.Service;

@Service
public class Processor01 extends AbstractProcessor {

    public Processor01() {
        setProcessorName("PROCESSOR 01");
    }

    @Override
    public ProcessorInterface getNewInstance() {
        return new Processor01();
    }

    @Override
    public void executeProcessor(String s) {

        System.out.println("Processor " + getProcessorName() + ": " + s);
    }


}
