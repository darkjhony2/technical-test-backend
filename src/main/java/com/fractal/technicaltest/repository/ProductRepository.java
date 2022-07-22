package com.fractal.technicaltest.repository;

import com.fractal.technicaltest.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Long> {
}
