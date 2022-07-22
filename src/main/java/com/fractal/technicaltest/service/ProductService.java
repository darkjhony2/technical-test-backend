package com.fractal.technicaltest.service;

import com.fractal.technicaltest.models.Order;
import com.fractal.technicaltest.models.Product;
import org.springframework.http.ResponseEntity;

public interface ProductService {

    ResponseEntity<?> createProduct(Product product);
    ResponseEntity<?> getAllProducts();
    ResponseEntity<?> deleteById(Long id);
    ResponseEntity<?> editProduct(Product product);
}
