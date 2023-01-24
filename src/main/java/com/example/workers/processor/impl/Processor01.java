package com.example.workers.processor.impl;

import com.example.ScopedSingleton;
import com.example.domain.Debit;
import com.example.workers.processor.AbstractProcessor;
import com.example.workers.processor.ProcessorInterface;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.springframework.stereotype.Service;

@Service
public class Processor01 extends AbstractProcessor {

    public Processor01() {
        setProcessorName("PROCESSOR 01");
    }

    @Override
    public ProcessorInterface getNewInstance() {
        return new Processor01();
    }

    @Override
    public void executeProcessor(String scope, ConcurrentLinkedQueue<Debit> queue) {

        System.out.println("Processor " + getProcessorName() + ": " + scope);

        ScopedSingleton control = ScopedSingleton.getInstance(scope);

        while (!control.getCompleted()) {

            try {
                Debit debit = queue.poll();

                if (Objects.isNull(debit)) {

                    System.out.println("Waiting");
                    Thread.sleep(500L);

                    continue;
                }

                System.out.println("'Data: " + debit.toString());

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("Completed");

    }


}
