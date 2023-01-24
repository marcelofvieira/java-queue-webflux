package com.example.worker.processor;

public abstract class AbstractProcessor implements ProcessorInterface {

    private String processorName;

    public AbstractProcessor() {
        setProcessorName("Abstract Processor");
    }

    @Override
    public void setProcessorName(String name) {
        this.processorName = name;
    }

    @Override
    public String getProcessorName() {
        return this.processorName;
    }

}
