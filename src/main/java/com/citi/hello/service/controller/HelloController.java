package com.citi.hello.service.controller;

import com.citi.hello.service.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class HelloController {

    @Autowired
    private HelloService service;
    @GetMapping
    public String getHelloMessage(){
        return "Hello Mockito Test";
    }

    @GetMapping
    public List<String> getAllHelloMessage(){
        return service.getAllMessage();
    }
}
