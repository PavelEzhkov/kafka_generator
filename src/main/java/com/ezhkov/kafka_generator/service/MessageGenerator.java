package com.ezhkov.kafka_generator.service;

import com.ezhkov.kafka_generator.dto.MessageDTO;

public interface MessageGenerator {
    MessageDTO generate();
}
