package com.example.demo_3.service;

import com.example.demo_3.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(Long id);
    Product updateProduct(Product product);
    Product createProduct(Product product);
    void deleteProduct(Long id);
}
