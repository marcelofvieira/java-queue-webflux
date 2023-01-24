package com.example.monitor.impl;

import com.example.ScopedSingleton;
import com.example.domain.Debit;
import com.example.monitor.MonitorInterface;
import com.example.worker.processor.AbstractProcessor;
import com.example.worker.reader.AbstractReader;

import java.util.concurrent.ConcurrentLinkedQueue;

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

        ScopedSingleton control = ScopedSingleton.getInstance("M1");

        ConcurrentLinkedQueue<Debit> queue = new ConcurrentLinkedQueue<>();

        abstractReader.executeReader("M1", queue);

        abstractProcessor.getNewInstance().executeProcessor("M1", queue);

        ScopedSingleton.dropInstance("M1");

    }





}
