package com.example.threads.producer;

import com.example.domain.MessageWrapper;
import com.example.domain.MonitorProcessConfig;
import com.example.domain.ProducerResponse;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;

public interface ProducerThreadInterface<P> {

    Future<ProducerResponse> startThread(String contextId, ConcurrentLinkedQueue<MessageWrapper> queue, P producer, MonitorProcessConfig config);

}
