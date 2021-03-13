package com.ezhkov.kafka_generator.service;

import com.ezhkov.kafka_generator.dto.MessageDTO;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
public class MessageGeneratorImpl implements MessageGenerator {

    @Autowired
    private WordGenerator wordGenerator;

    @Value("${kafka.wordlength}")
    private int worldLength;

    @Override
    @SneakyThrows
    public MessageDTO generate() {
        String word = wordGenerator.generateWord(worldLength);
        return MessageDTO.builder().word(word).build();
    }
}
