package com.arsh.products.controller;

import com.arsh.products.model.Product;
import com.arsh.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
            return productService.getProductById(id);
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/search")
    public List<Product> getProductsByTitle(@RequestParam String searchTerm) {
        return productService.getProductsByTitle(searchTerm);
    }
    @GetMapping("/brand")
    public List<Product> getProductsByBrand(@RequestParam String brand) {
        return productService.getProductsByBrand(brand);
    }

    @GetMapping("/category")
    public List<Product> getProductsByCategory(@RequestParam String category) {
        return productService.getProductsByCategory(category);
    }
    @GetMapping("/brand-cate")
    public List<Product> getProductsByBrandCategory(@RequestParam String brand, @RequestParam String category) {
        return productService. getProductsByBrandCategory(brand,category);
    }

    @GetMapping( "/price-range")
    public List<Product> getProductsByPriceRange(@RequestParam int startPrice, @RequestParam int endPrice) {
        return productService.getProductsByPriceRange(startPrice,endPrice);
    }
    @GetMapping("/title-brand-cate")
    public List<Product> getProductsByTitleBrandCategory(@RequestParam String searchTerm, @RequestParam String brand, @RequestParam String category) {
        return productService.getProductsByTitleBrandCategory(searchTerm,brand,category);
    }

    @GetMapping("/title-price")
    public List<Product> getProductsByTitleAndPriceRange(@RequestParam String searchTerm, @RequestParam int startPrice,@RequestParam int endPrice) {
        return productService.getProductsByTitleAndPriceRange(searchTerm,startPrice,endPrice);
    }

    @GetMapping("title-category")
    public List<Product> getProductsByCategoryOrderByTitle(@RequestParam String category) {
        return productService.getProductsByCategory0rderByTitle(category);
    }

    @GetMapping("/price-desc")
    public List<Product> getProductsByPriceDesc() {
        return productService.getProductsByPriceDesc();
    }
    @GetMapping("/brand-price")
    public List<Product> findByBrandAndPriceBetween(String brand, Double minPrice, Double maxPrice){
        return productService.findByBrandAndPriceBetween(brand,minPrice,maxPrice);
    }
    @GetMapping("/title-prefix")
    public List<Product> findByTitleStartingWith(@RequestParam String prefix) {
        return productService.findByTitleStartingWith(prefix);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        return productService.updateProduct(id, productDetails);
    }
    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }



}
