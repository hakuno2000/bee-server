package com.example.bee.controller;

import com.example.bee.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public ResponseEntity<Object> getAllOrders() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @GetMapping("/{phone}")
    public ResponseEntity<Object> getUserOrders(@PathVariable("phone") String phone) {
        return ResponseEntity.ok(orderService.findOrdersBySenderPhone(phone));
    }
}
