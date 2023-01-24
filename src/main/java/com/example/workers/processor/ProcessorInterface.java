package com.example.workers.processor;

import com.example.domain.Debit;
import java.util.concurrent.ConcurrentLinkedQueue;

public interface ProcessorInterface {

    ProcessorInterface getNewInstance();

    void setProcessorName(String name);

    String getProcessorName();

    void executeProcessor(String scope, ConcurrentLinkedQueue<Debit> queue);

}
