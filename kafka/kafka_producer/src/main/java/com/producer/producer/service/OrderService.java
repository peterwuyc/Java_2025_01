package com.producer.producer.service;

import com.google.gson.Gson;
import com.producer.producer.model.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate kafkaTemplate;
    public String sender(OrderEntity orderEntity){
        Gson gson=new Gson();
        kafkaTemplate.send("order",gson.toJson(orderEntity));
        return "success";
    }
}
