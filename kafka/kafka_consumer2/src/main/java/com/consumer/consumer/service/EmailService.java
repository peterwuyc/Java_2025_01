package com.consumer.consumer.service;

import com.consumer.consumer.model.OrderEntity;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    Logger logger=LoggerFactory.getLogger("email service");

    @KafkaListener(topics = "order")
    public void onMessage(String orderJson){
        Gson gson=new Gson();
        OrderEntity orderEntity=gson.fromJson(orderJson,OrderEntity.class);
        String email=orderEntity.getUserEmail();
        sendEmail(email);
    }

    private void sendEmail(String email){
        logger.info("send email to: "+email);
        /*
          logic->
         */
    }
}
