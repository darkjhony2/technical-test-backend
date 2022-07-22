package com.fractal.technicaltest.service;

import com.fractal.technicaltest.models.Order;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrderService {

    ResponseEntity<?> getAllOrders();
    ResponseEntity<?> createOrder(Order order);
}
