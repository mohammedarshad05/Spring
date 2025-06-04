package com.arsh.app.controller;

import com.arsh.app.model.Product;
import com.arsh.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productt")
public class ProductController {
    private final ProductService productService;
    @Autowired

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        productService.createProduct(product);
        return product;
    }
    @GetMapping("/{id}")
    public Product getProductsById(@PathVariable int id){
        return productService.getAllProductsById(id);
    }
}
