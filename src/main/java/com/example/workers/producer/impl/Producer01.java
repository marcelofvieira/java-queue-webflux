package com.example.workers.producer.impl;

import com.example.ScopedSingleton;
import com.example.domain.MessageWrapper;
import com.example.domain.ProducerResponse;
import com.example.domain.ProducerWrapper;
import com.example.repository.MockDebitRepository;
import com.example.workers.producer.ProducerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class Producer01 implements ProducerInterface {

  private static final  String PROCESS_NAME = "Producer 01";

  @Autowired
  private MockDebitRepository repository;

  @Override
  public String getProcessName() {
    return this.PROCESS_NAME;
  }

  @Override
  public ProducerResponse execute(ProducerWrapper wrapper) {

    System.out.println(wrapper.getContexId() + " " + this.getProcessName() + ": Starting..." );

    ScopedSingleton control = ScopedSingleton.getInstance(wrapper.getContexId());

    repository.findListAllDebits().forEach(i -> {

      System.out.println(wrapper.getContexId() + " " + this.getProcessName() + ": Create new message [" + i.toString() + "]" );

      wrapper.getQueue().add(MessageWrapper.builder().data(i).build());

      try {
        //TODO: Producer time
        Thread.sleep(50);
      } catch (InterruptedException e) {
      }

    });

    System.out.println(wrapper.getContexId() + " " + this.getProcessName() + ": Completed" );

    control.setCompleted(true);

    return ProducerResponse.builder().completed(true).build();
  }

}
