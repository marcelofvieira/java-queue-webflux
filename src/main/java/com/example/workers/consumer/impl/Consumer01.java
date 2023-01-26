package com.example.workers.consumer.impl;

import com.example.ScopedSingleton;
import com.example.domain.ConsumerResponse;
import com.example.domain.ConsumerWrapper;
import com.example.domain.MessageWrapper;
import com.example.workers.consumer.ConsumerInterface;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class Consumer01 implements ConsumerInterface {

    private static final  String PROCESS_NAME = "Process of consumer 01";

  @Override
  public String getProcessName() {

    return this.PROCESS_NAME;
  }

  @Override
  public ConsumerResponse execute(ConsumerWrapper wrapper) {

    System.out.println(wrapper.getContexId() + " " + this.getProcessName());

    ScopedSingleton control = ScopedSingleton.getInstance(wrapper.getContexId());

    while (!control.getCompleted() || !wrapper.getQueue().isEmpty()) {

      try {
        MessageWrapper message = wrapper.getQueue().poll();

        if (Objects.isNull(message)) {

          System.out.println(wrapper.getContexId() + " " + wrapper.getName() + " Waiting");
          Thread.sleep(1000L);

          continue;
        }

        System.out.println(wrapper.getContexId() + " " + wrapper.getName() + " Consumer: " + message.getData().toString());

        Thread.sleep(500L);

      } catch (Exception e) {
        throw new RuntimeException(e);
      }

    }

    System.out.println(wrapper.getContexId() + " " + wrapper.getName() + " Completed!");

    return ConsumerResponse.builder().completed(true).build();
  }

}
