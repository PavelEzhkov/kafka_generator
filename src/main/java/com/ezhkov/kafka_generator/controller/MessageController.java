package com.ezhkov.kafka_generator.controller;


import com.ezhkov.kafka_generator.dto.MessageDTO;
import com.ezhkov.kafka_generator.service.MessageGenerator;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
@Setter
public class MessageController {

    @Autowired
    private KafkaTemplate<String, MessageDTO> kafkaTemplate;

    @Autowired
    private MessageGenerator messageGenerator;

    @Scheduled(fixedDelayString = "${kafka.timeout}")
    public void send() {
        kafkaTemplate.send("word", messageGenerator.generate());

    }

}
