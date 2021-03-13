package com.ezhkov.kafka_generator.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class WordGeneratorImpl implements WordGenerator {

    @Override
    public String generateWord(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }
}
