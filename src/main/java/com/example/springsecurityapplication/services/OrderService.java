package com.example.springsecurityapplication.services;

import com.example.springsecurityapplication.enumm.Status;
import com.example.springsecurityapplication.models.Category;
import com.example.springsecurityapplication.models.Order;
import com.example.springsecurityapplication.models.Product;
import com.example.springsecurityapplication.repositories.OrderRepository;
import com.example.springsecurityapplication.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Данный метод позволяет сохранить товар
    @Transactional
    public void setStatus(Order order, Status status){
        order.setStatus(status);
        this.orderRepository.save(order);
    }
}
