package com.ezhkov.kafka_generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableKafka
@EnableScheduling
public class KafkaGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaGeneratorApplication.class, args);
    }

}
