package com.example.demo_3.controller;

import com.example.demo_3.model.Product;
import com.example.demo_3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){//ResponseEntity - для обработки исключений
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("{id}") Long id){
        Product productById = productService.getProductById(id);
        if (productById == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Product());
        }
        return new ResponseEntity<>(productById, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.updateProduct(product), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
        return ResponseEntity.ok().build();
    }
}
