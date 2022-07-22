package com.fractal.technicaltest.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Order {
    @Id
    private Long id;
    private String orderNumber;
    private LocalDateTime date;
    private Integer products;
    private Double finalPrice;
    private List<Product> productList;

    public Order(Long id, String orderNumber, LocalDateTime date, Integer products, List<Product> productList) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.date = date;
        this.products = products;
        this.productList = productList;
    }
}
