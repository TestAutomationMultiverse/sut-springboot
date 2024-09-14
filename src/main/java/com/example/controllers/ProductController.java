package com.example.controllers;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Retrieves a product by ID
     *
     * @param id ID of the product to retrieve
     * @return the product with the given ID, or null if no product exists with that ID
     */
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    /**
     * Retrieves a list of all products
     *
     * @return a list of all products
     */
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /**
     * Creates a new product
     *
     * @param product product to be created
     */
    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }


    /**
     * Deletes a product by id
     *
     * @param id id of the product to be deleted
     */
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}

