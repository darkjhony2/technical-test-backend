package com.fractal.technicaltest;

import com.fractal.technicaltest.models.Order;
import com.fractal.technicaltest.models.Product;
import com.fractal.technicaltest.repository.ProductRepository;
import com.fractal.technicaltest.service.OrderService;
import com.fractal.technicaltest.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TechnicalTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalTestApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(ProductService productService){
//		return args -> {
//			Product product = new Product(1L,"Monster",10.5,4 );
//			Product product2 = new Product(2L,"RedBull",15.5,8 );
//			productService.createProduct(product2);
//		};
//	}

//	@Bean
//	CommandLineRunner runner(OrderService orderService, ProductRepository productRepository){
//		return args -> {
//			System.out.println("1");
//			List<Product> productList = new ArrayList<>();
//			Product product1 = productRepository.findById(1L).orElse(null);
//			Product product2 = productRepository.findById(2L).orElse(null);
//			productList.add(product1);
//			productList.add(product2);
//			Order order = new Order(1L,"Ord00001", LocalDateTime.now(),2,productList);
//			orderService.createOrder(order);
//		};
//	}

}
