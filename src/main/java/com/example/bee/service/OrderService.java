package com.example.bee.service;

import com.example.bee.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findOrdersBySenderPhone(String phone);
    List<Order> findOrdersBySenderName(String senderName);
    List<Order> findAll();
}
