package com.nova.springbootcrud.controller;

import com.nova.springbootcrud.entity.Product;
import com.nova.springbootcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/saveProducts")
    public List<Product> saveAll(@RequestBody List<Product> products) {
        return productService.saveAll(products);
    }

    @PostMapping("/saveProduct")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

        @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/getProduct/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
}
