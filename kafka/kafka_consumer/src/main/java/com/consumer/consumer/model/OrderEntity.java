package com.consumer.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    private String userName;
    private String userEmail;
    private String orderDetails;


}
