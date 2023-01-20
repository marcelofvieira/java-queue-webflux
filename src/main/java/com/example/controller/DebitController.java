package com.example.controller;

import com.example.domain.Debit;
import com.example.repository.MockDebitRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/debits")
public class DebitController {

  private final MockDebitRepository repository;

  public DebitController(MockDebitRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/{id}")
  private Mono<Debit> getEmployeeById(@PathVariable Long id) {
    return repository.findById(id);
  }

  @GetMapping
  private Flux<Debit> getAllDebits() {
    return repository.findAllDebits();
  }

  @PostMapping("/update")
  private Mono<Debit> updateEmployee(@RequestBody Debit debit) {
    return repository.updateDebit(debit);
  }

}
