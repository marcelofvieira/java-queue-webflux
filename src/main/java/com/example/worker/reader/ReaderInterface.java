package com.example.worker.reader;

public interface ReaderInterface {

    void executeReader(String s);

    void setReaderName(String name);

    String getReaderName();

    ReaderInterface getNewInstance();

}
