package com.example.bee.repo;

import com.example.bee.entity.Account;
import com.example.bee.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    List<Order> findOrdersBySenderPhone(String phone);
    List<Order> findOrdersBySenderName(String senderName);
}
