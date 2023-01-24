package com.example.threads.consumer;

import com.example.domain.Debit;
import java.util.concurrent.ConcurrentLinkedQueue;

public interface ConsumerThreadInterface<C> {

    void execute(String context, ConcurrentLinkedQueue<Debit> queue, C consumer);

}
