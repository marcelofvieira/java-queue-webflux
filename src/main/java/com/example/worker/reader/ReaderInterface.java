package com.example.worker.reader;

import java.util.concurrent.ConcurrentLinkedQueue;

public interface ReaderInterface {

    void executeReader(String scope, ConcurrentLinkedQueue queue);

    void setReaderName(String name);

    String getReaderName();

    ReaderInterface getNewInstance();

}
