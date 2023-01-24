package com.example.worker.reader;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedTransferQueue;

public interface ReaderInterface {

    void executeReader(String scope, ConcurrentLinkedQueue queue);

    void setReaderName(String name);

    String getReaderName();

    ReaderInterface getNewInstance();

}
