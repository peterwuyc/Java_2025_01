package com.producer.producer.controller;

import com.producer.producer.model.OrderEntity;
import com.producer.producer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private OrderService service;
    @PostMapping("/v1/order")
    public String createOrder(@RequestBody OrderEntity orderEntity){
        service.sender(orderEntity);
        return "success";
    }
}
