package com.example.workers.reader.impl;

import com.example.workers.reader.AbstractReader;
import com.example.workers.reader.ReaderInterface;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.springframework.stereotype.Service;

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
