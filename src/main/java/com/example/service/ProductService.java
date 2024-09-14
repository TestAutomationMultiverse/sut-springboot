package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface ProductService {
    Product getProductById(Long id);
    void saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
}
