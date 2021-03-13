package com.ezhkov.kafka_generator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordGeneratorImplTest {

    WordGeneratorImpl wordGenerator = new WordGeneratorImpl();

    @Test
    void generateWord() {
        String generatedWord = wordGenerator.generateWord(10);
        assertNotNull(generatedWord);
        assertEquals(10, generatedWord.length());
    }
}