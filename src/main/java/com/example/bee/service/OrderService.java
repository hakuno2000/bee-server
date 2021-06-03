package com.example.bee.service;

import com.example.bee.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findOrdersBySenderPhone(String phone);
    List<Order> findOrdersBySenderName(String senderName);
    List<Order> findAll();
    List<Order> findOrdersNotCompleted();
    List<Order> findShippingOrdersByAccount_Phone(String account_phone);
    List<Order> findCompletedOrdersByAccount_Phone(String account_phone);
    void save(Order order);
}
