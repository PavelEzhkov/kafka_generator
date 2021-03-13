package com.ezhkov.kafka_generator.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MessageDTO {
    private final String word;
}
