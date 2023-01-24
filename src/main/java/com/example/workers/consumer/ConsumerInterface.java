package com.example.workers.consumer;

import com.example.domain.ConsumerResponse;
import com.example.domain.ConsumerWrapper;
import com.example.workers.WorkersInterface;

public interface ConsumerInterface extends WorkersInterface {

  ConsumerResponse execute(ConsumerWrapper wrapper);

}
