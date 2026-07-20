package com.cognizant.product_service.controller;

import com.cognizant.product_service.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final List<Product> products = List.of(
            new Product(1, "Laptop", 15),
            new Product(2, "Phone", 30),
            new Product(3, "Keyboard", 50)
    );

    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
}