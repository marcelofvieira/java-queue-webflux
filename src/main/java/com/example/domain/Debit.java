package com.example.domain;

import lombok.*;

import java.time.LocalDate;

@Builder
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Debit {

  private Long id;

  private LocalDate debitDate;

  private Double debitValue;

}
