package com.example.threads.producer;

import com.example.domain.Debit;
import java.util.concurrent.ConcurrentLinkedQueue;

public interface ProducerThreadInterface<P> {

    void executeConsumer(String scope, ConcurrentLinkedQueue<Debit> queue, P producer);

}
