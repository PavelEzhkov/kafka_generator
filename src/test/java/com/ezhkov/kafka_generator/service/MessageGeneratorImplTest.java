package com.ezhkov.kafka_generator.service;

import com.ezhkov.kafka_generator.dto.MessageDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

class MessageGeneratorImplTest {

    @Mock
    WordGenerator wordGenerator;

    @InjectMocks
    MessageGeneratorImpl messageGenerator;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void generate() {
        when(wordGenerator.generateWord(anyInt())).thenReturn("word");
        final MessageDTO generate = messageGenerator.generate();
        assertEquals("word", generate.getWord());
    }
}