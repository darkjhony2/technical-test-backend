package com.fractal.technicaltest.service;

import com.fractal.technicaltest.models.Product;
import org.springframework.http.ResponseEntity;

public interface ProductService {

    ResponseEntity<String> createProduct(Product product);
}
