package com.example.domain;

import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProducerWrapper {

  private String contexId;

  private ConcurrentLinkedQueue<MessageWrapper> queue;

}
