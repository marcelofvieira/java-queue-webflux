package com.example.threads.consumer;

import com.example.domain.ConsumerResponse;
import com.example.domain.MessageWrapper;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;

public interface ConsumerThreadInterface<C> {

    Future<ConsumerResponse> startThread(String contextId, ConcurrentLinkedQueue<MessageWrapper> queue, C consumer);

}
