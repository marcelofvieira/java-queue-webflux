package com.example.worker.processor;

public interface ProcessorInterface {

    ProcessorInterface getNewInstance();

    void setProcessorName(String name);

    String getProcessorName();

    void executeProcessor(String s);

}
