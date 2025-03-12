package com.consumer.consumer.service;

import com.consumer.consumer.model.OrderEntity;
import com.google.gson.Gson;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @KafkaListener(topics = "order")
    public void onMessage(String orderJson){
        Gson gson=new Gson();
        OrderEntity orderEntity=gson.fromJson(orderJson,OrderEntity.class);
        String orderDetails=orderEntity.getOrderDetails();
        payment(orderDetails);
    }

    public void payment(String orderDetails){
        System.out.println(orderDetails);
        /*
        payment-> xxxxx
        kafka -> send
         */
    }
}
