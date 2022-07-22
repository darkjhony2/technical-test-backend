package com.fractal.technicaltest.service.impl;

import com.fractal.technicaltest.models.Order;
import com.fractal.technicaltest.repository.OrderRepository;
import com.fractal.technicaltest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public ResponseEntity<?> getAllOrders() {
        List<Order> orderList = new ArrayList<>();
        try {
            orderList = orderRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("(e): " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(orderList);
    }

    @Override
    public ResponseEntity<?> createOrder(Order order) {
        try {
            orderRepository.insert(order);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("(e): " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok("Saved");
    }

    @Override
    public ResponseEntity<?> deleteById(Long id) {
        try {
            orderRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("(e): " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok("Deleted");
    }
}
