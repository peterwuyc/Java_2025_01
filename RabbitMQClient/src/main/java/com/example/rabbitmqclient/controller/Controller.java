package com.example.rabbitmqclient.controller;

import com.example.rabbitmqclient.service.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private RabbitMQProducer rabbitMQProducer;
    @PostMapping(value = "/message")
    public String send(@RequestParam String message) {
        rabbitMQProducer.sendMessage(message);
        return "success";
    }
}
