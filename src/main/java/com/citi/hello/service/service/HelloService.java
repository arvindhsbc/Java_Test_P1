package com.citi.hello.service.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {

    List<String> messageList = new ArrayList<>();

    public List<String> getAllMessage(){
        messageList.add("Hello this is message 1");
        messageList.add("Hello this is message 2");
        messageList.add("Hello this is message 3");
        return messageList;
    }
}
