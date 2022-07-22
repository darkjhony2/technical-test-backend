package com.fractal.technicaltest.repository;

import com.fractal.technicaltest.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Long> {
}
