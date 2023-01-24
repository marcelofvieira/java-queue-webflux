package com.example.workers.producer;

import com.example.domain.ProducerResponse;
import com.example.domain.ProducerWrapper;
import com.example.workers.WorkersInterface;

public interface ProducerInterface extends WorkersInterface {

  ProducerResponse execute(ProducerWrapper wrapper);

}
