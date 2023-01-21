package com.example.monitor.impl;

import com.example.monitor.MonitorInterface;
import com.example.worker.processor.AbstractProcessor;
import com.example.worker.reader.AbstractReader;

public class Monitor<A extends AbstractReader, B extends AbstractProcessor> implements MonitorInterface {

    private final AbstractReader abstractReader;
    private final AbstractProcessor abstractProcessor;

    public Monitor(A abstractReader, B abstractProcessor) {
        this.abstractReader = abstractReader;
        this.abstractProcessor = abstractProcessor;
    }

    @Override
    public void execute(String configName) {
        System.out.println("Execute Monitor");

        abstractReader.executeReader("RRRR");

        abstractProcessor.executeProcessor("PPP");
    }





}
