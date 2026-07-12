package com.cognizant.customer_servicedo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Map<String, Object> getCustomer(@PathVariable String id) {

        return Map.of(
                "customerId", id,
                "name", "Rahul Sharma",
                "city", "Delhi",
                "accountType", "Current"
        );

    }

}
