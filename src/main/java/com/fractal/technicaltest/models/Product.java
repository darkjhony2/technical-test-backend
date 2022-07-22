package com.fractal.technicaltest.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {

    @Id
    private Long id;
    private String name;
    private Double unitPrice;
    private Integer qty;
    private Double totalPrice;

    public Product(Long id, String name, Double unitPrice, Integer qty) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.totalPrice = unitPrice * qty;
    }
}
