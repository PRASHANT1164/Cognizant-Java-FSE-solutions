package com.cognizant.payment_service.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/{id}")
    public Map<String, Object> getPayment(@PathVariable String id) {

        return Map.of(
                "paymentId", id,
                "amount", 15000,
                "status", "Success",
                "mode", "UPI"
        );

    }

}