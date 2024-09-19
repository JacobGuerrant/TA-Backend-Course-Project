package com.example.demo.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class PurchaseResponse {

    //private final String orderTrackingNumber;

    private String orderTrackingNumber;

    /*
    public PurchaseResponse(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }
    */
}