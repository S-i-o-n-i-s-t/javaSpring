package com.example.task_3.servises;

import com.example.task_3.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    private List<Product> productList = new ArrayList<>();
    public void addProduct(Product product){
        this.productList.add(product);
    }
    public List<Product> faindProduct(){
        return this.productList;
    }

}
