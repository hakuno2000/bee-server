package com.example.bee.controller;

import com.example.bee.entity.Account;
import com.example.bee.entity.Order;
import com.example.bee.service.AccountService;
import com.example.bee.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private AccountService accountService;

    @GetMapping("")
    public ResponseEntity<Object> getAllOrders() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @GetMapping("/{phone}")
    public ResponseEntity<Object> getUserOrders(@PathVariable("phone") String phone) {
        return ResponseEntity.ok(orderService.findOrdersBySenderPhone(phone));
    }

    @GetMapping("/notcompleted")
    public ResponseEntity<Object> getNotCompletedOrders() {
        return ResponseEntity.ok(orderService.findOrdersNotCompleted());
    }

    @GetMapping("/my/shipping")
    public ResponseEntity<Object> getMyShippingOrders(@RequestBody Account account) {
        return ResponseEntity.ok(orderService.findShippingOrdersByAccount_Phone(account.getPhone()));
    }

    @GetMapping("/my/completed")
    public ResponseEntity<Object> getMyCompletedOrders(@RequestBody Account account) {
        return ResponseEntity.ok(orderService.findCompletedOrdersByAccount_Phone(account.getPhone()));
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createOrder(@RequestBody Order order) {
        Account matchedAccount = accountService.findAccountByPhone(order.getAccount().getPhone());
        if (matchedAccount == null) return ResponseEntity.badRequest().build();
        order.setAccount(matchedAccount);
        orderService.save(order);
        return ResponseEntity.ok(order);
    }
}
