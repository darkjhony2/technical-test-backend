package com.fractal.technicaltest.controller;

import com.fractal.technicaltest.models.Order;
import com.fractal.technicaltest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<?> fetchAllOrder(){
        return orderService.getAllOrders();
    }

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteOrder(@RequestParam Long id){
        return orderService.deleteById(id);
    }

    @PutMapping
    public ResponseEntity<?> editOrder(@RequestBody Order order){
        return orderService.editOrder(order);
    }

}
