package com.example.worker.processor;

import com.example.domain.Debit;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedTransferQueue;

public interface ProcessorInterface {

    ProcessorInterface getNewInstance();

    void setProcessorName(String name);

    String getProcessorName();

    void executeProcessor(String scope, ConcurrentLinkedQueue<Debit> queue);

}
