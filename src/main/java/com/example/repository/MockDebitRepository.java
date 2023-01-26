package com.example.repository;

import com.example.domain.Debit;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class MockDebitRepository {

    private static final Map<Long, Debit> DEBIT_DATA;

    private static final int DATA_SIZE = 300;

    static {
      DEBIT_DATA = new HashMap<>();

      for (long i = 1; i < DATA_SIZE + 1; i++) {
        DEBIT_DATA.put(i, Debit.builder().id(i).debitDate(LocalDate.now().plusDays(5L)).debitValue(ThreadLocalRandom.current().nextDouble(1.00, 1000.00)).build());
      }

    }

    public Mono<Debit> findById(Long id) {
      return Mono.just(DEBIT_DATA.get(id));
    }

    public Flux<Debit> findAllDebits() {
      return Flux.fromIterable(DEBIT_DATA.values());
    }

    public List<Debit> findListAllDebits() {
      return DEBIT_DATA.values().stream().toList();
    }


    public Mono<Debit> updateDebit(Debit Debit) {

      Debit existingDebit = DEBIT_DATA.get(Debit.getId());

      if (existingDebit != null) {
        existingDebit.setDebitDate(Debit.getDebitDate());
        existingDebit.setDebitValue(Debit.getDebitValue());
      }

      return Mono.just(existingDebit);
    }
  
}
