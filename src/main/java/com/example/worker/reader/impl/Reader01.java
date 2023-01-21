package com.example.worker.reader.impl;

import com.example.worker.reader.AbstractReader;
import com.example.worker.reader.ReaderInterface;
import org.springframework.stereotype.Service;

@Service
public class Reader01 extends AbstractReader {

    public Reader01(){
        setReaderName("Reader 01");
    }

    @Override
    public void executeReader(String s) {
        System.out.println("Reader " + getReaderName() + ": " + s);
    }

    @Override
    public ReaderInterface getNewInstance() {
        return new Reader01();
    }

}
