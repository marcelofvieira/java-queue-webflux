package com.example.worker.reader.impl;

import com.example.ScopedSingleton;
import com.example.repository.MockDebitRepository;
import com.example.worker.reader.AbstractReader;
import com.example.worker.reader.ReaderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class Reader01 extends AbstractReader {

    @Autowired
    private MockDebitRepository repository;

    public Reader01(){
        setReaderName("Reader 01");
    }

    @Override
    public void executeReader(String scope, ConcurrentLinkedQueue queue) {

        System.out.println("Reader " + getReaderName() + ": " + scope);

        ScopedSingleton control = ScopedSingleton.getInstance(scope);

        repository.findListAllDebits().forEach(i -> {

            System.out.println("Producer: " + i.toString());

            queue.add(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        });

        control.setCompleted(true);

    }

    @Override
    public ReaderInterface getNewInstance() {
        return new Reader01();
    }

}
