package com.fractal.technicaltest.service.impl;

import com.fractal.technicaltest.models.Product;
import com.fractal.technicaltest.repository.ProductRepository;
import com.fractal.technicaltest.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<String> createProduct(Product product) {
        try {
            productRepository.insert(product);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("(e): " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok("Saved.");
    }
}
