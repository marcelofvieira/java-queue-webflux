package com.example.workers.reader;

public abstract class AbstractReader implements ReaderInterface {

    private String readerName;

    public AbstractReader(){
        setReaderName("Abstract Reader");
    }

    @Override
    public void setReaderName(String name) {
        this.readerName = name;
    }

    @Override
    public String getReaderName() {
        return this.readerName;
    }


}
