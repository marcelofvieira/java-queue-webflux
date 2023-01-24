package com.example.workers.consumer;

import java.util.concurrent.ConcurrentLinkedQueue;

public interface ConsumerWorkerInterface {

    void execute(String scope, ConcurrentLinkedQueue queue);

    void setReaderName(String name);

    String getReaderName();

    ConsumerWorkerInterface getNewInstance();

}
