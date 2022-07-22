package com.fractal.technicaltest.service.impl;

import com.fractal.technicaltest.models.Order;
import com.fractal.technicaltest.models.Product;
import com.fractal.technicaltest.repository.ProductRepository;
import com.fractal.technicaltest.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public ResponseEntity<?> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        try {
            productList = productRepository.findAll();
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("(e): " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(productList);
    }

    @Override
    public ResponseEntity<?> deleteById(Long id) {
        try {
            productRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("(e): " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok("Deleted");
    }

    @Override
    public ResponseEntity<?> editProduct(Product product) {
        try {
            Product productdb = productRepository.findById(product.getId()).orElse(null);
            if(productdb != null){
                productRepository.save(product);
            }
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("(e): " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok("Edited");
    }
}
