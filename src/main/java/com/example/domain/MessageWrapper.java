package com.example.domain;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MessageWrapper {

    private String context;

    private Object data;

}
