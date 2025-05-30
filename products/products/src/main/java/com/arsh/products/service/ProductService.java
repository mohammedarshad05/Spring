package com.arsh.products.service;

import com.arsh.products.model.Product;
import com.arsh.products.repository.ProductRepository;
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

    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    public Product getProductById(Long id) {
        Product dummyProduct = new Product();
        dummyProduct.setId(0L);
        dummyProduct.setTitle("product not found");
        dummyProduct.setPrice(0);
        return productRepository.findById(id).orElse(dummyProduct);
    }

    public List<Product> getProductsByTitle(String searchTerm) {
        return productRepository.findByTitleContainingIgnoreCase(searchTerm);
    }

    public List<Product> getProductsByPriceRange(int startPrice, int endPrice) {
        return productRepository.findByPriceBetween(startPrice, endPrice);
    }


    public List<Product> getProductsByTitleAndPriceRange(String searchTerm, int startPrice, int endPrice) {
        return productRepository.findByTitleContainingIgnoreCaseAndPriceBetween(searchTerm,startPrice,endPrice);

    }


    public List<Product> getProductsByBrand(String brand) {
    return productRepository.findByBrandIgnoreCase(brand);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryIgnoreCase(category);
    }


    public List<Product> getProductsByBrandCategory(String brand, String category) {
    return productRepository.findByBrandAndCategoryIgnoreCase(brand,category);
    }

    public List<Product> getProductsByTitleBrandCategory(String searchTerm, String brand, String category) {
    return productRepository.findByTitleAndBrandAndCategoryIgnoreCase(searchTerm,brand,category);
    }

    public List<Product> getProductsByCategory0rderByTitle(String category) {
        return productRepository.findByCategoryIgnoreCaseOrderByTitle(category);
    }

    public List<Product> getProductsByPriceDesc() {
     return productRepository.findAllProductsByOrderByPriceDesc();
    }
    public List<Product> findByBrandAndPriceBetween(String brand,double mintPrice, double maxPrice) {
        return productRepository.findByBrandAndPriceBetween(brand,mintPrice,maxPrice);
    }


    public List<Product> findByTitleStartingWith(String prefix) {
        return productRepository.findByTitleStartingWith(prefix);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {

        Product product = productRepository.findById(id).orElseThrow();
        product.setTitle(productDetails.getTitle());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);

    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }


}


