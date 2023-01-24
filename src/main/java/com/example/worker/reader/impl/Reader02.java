package com.example.worker.reader.impl;

import com.example.worker.reader.AbstractReader;
import com.example.worker.reader.ReaderInterface;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class Reader02 extends AbstractReader {

    public Reader02(){
        setReaderName("Reader 02");
    }

    @Override
    public void executeReader(String scope, ConcurrentLinkedQueue queue) {
        System.out.println("Reader " + getReaderName());
    }

    @Override
    public ReaderInterface getNewInstance() {
        return new Reader02();
    }

}
