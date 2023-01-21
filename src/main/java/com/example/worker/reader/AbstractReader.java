package com.example.worker.reader;

public abstract class AbstractReader implements ReaderInterface {

    private String readerName;

    public AbstractReader(){
        setReaderName("Abstract Reader");
    }

    @Override
    public void executeReader(String s) {
        System.out.println("Abstract Reader: " + s);
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
