package com.example.demo_3.service;

import com.example.demo_3.model.Product;
import com.example.demo_3.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServices implements ProductService{

    private final ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseGet(null);
    }

    @Override
    public Product updateProduct(Product product) {
        Product productById = getProductById(product.getId());
        productById.setCount(product.getCount());
        productById.setName(product.getName());
        productById.setQuantity(product.getQuantity());
        return productRepository.save(productById);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
