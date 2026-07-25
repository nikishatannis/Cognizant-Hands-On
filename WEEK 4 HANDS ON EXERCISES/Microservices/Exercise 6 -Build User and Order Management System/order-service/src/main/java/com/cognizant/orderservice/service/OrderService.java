package com.cognizant.orderservice.service;

import com.cognizant.orderservice.client.UserClient;
import com.cognizant.orderservice.entity.Order;
import com.cognizant.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserClient userClient;

    public Order createOrder(Order order) {

        // Check if user exists
        userClient.getUserById(order.getUserId());

        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}