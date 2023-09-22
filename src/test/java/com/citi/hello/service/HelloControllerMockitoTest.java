package com.citi.hello.service;

import com.citi.hello.service.controller.HelloController;
import com.citi.hello.service.service.HelloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HelloControllerMockitoTest {

    @Mock
    HelloService helloService;

    @InjectMocks
    HelloController helloController;

    @BeforeEach
    void setMockOutput() {
       // when(helloService.getAllMessage()).thenReturn(Collections.singletonList("Hello Mockito Test"));
    }

    @Test
    public void shouldReturnDefaultMessage() {
        String response = helloController.getHelloMessage();
        assertThat(response).isEqualTo("Hello Mockito Test");
    }
}
