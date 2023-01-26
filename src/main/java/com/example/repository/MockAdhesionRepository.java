package com.example.repository;

import com.example.domain.Adhesion;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class MockAdhesionRepository {

    private static final Map<Long, Adhesion> ADHESION_DATA;

    private static final int DATA_SIZE = 100;

    static {
      ADHESION_DATA = new HashMap<>();

      for (long i = 1; i < DATA_SIZE + 1; i++) {
        ADHESION_DATA.put(i, Adhesion.builder()
            .id(i)
                .agreementCode("CODE_" + i)
                .userAgreementCode("USER_CODE_" + i)
            .build());
      }

    }

    public Mono<Adhesion> findById(Long id) {
      return Mono.just(ADHESION_DATA.get(id));
    }

    public Flux<Adhesion> findAllAdhesions() {
      return Flux.fromIterable(ADHESION_DATA.values());
    }

    public List<Adhesion> findListAllAdhesions() {
      return ADHESION_DATA.values().stream().toList();
    }

    public Mono<Adhesion> updateAdhesion(Adhesion Adhesion) {

      Adhesion existingAdhesion = ADHESION_DATA.get(Adhesion.getId());

      if (existingAdhesion != null) {
        existingAdhesion.setAgreementCode(Adhesion.getAgreementCode());
        existingAdhesion.setUserAgreementCode(Adhesion.getUserAgreementCode());
      }

      return Mono.just(existingAdhesion);
    }
  
}
