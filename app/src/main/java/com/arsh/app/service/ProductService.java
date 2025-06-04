package com.arsh.app.service;

import com.arsh.app.model.Product;
import com.arsh.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;
    @Autowired

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getAllProductsById(int id) {
        return productRepository.getAllProductsById(id);
    }

    public void createProduct(Product product) {
        productRepository.save(product);
    }
}
