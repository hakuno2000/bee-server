package com.example.bee.service;

import com.example.bee.entity.Order;
import com.example.bee.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> findOrdersBySenderPhone(String phone) {
        return orderRepo.findOrdersBySenderPhone(phone);
    }

    @Override
    public List<Order> findOrdersBySenderName(String senderName) {
        return orderRepo.findOrdersBySenderName(senderName);
    }

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public List<Order> findOrdersNotCompleted() {
        return orderRepo.findOrdersByStatus(false);
    }

    @Override
    public List<Order> findShippingOrdersByAccount_Phone(String account_phone) {
        return orderRepo.findOrdersByAccount_PhoneAndStatus(account_phone, false);
    }

    @Override
    public List<Order> findCompletedOrdersByAccount_Phone(String account_phone) {
        return orderRepo.findOrdersByAccount_PhoneAndStatus(account_phone, true);
    }

    @Override
    public void save(Order order) {
        orderRepo.save(order);
    }
}
