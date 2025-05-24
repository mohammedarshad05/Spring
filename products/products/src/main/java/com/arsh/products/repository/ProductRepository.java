package com.arsh.products.repository;

import com.arsh.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitleContainingIgnoreCase(String searchTerm);

    List<Product> findByPriceBetween(int startPrice, int endPrice);


    List<Product> findByTitleContainingIgnoreCaseAndPriceBetween(String searchTitle, int startPrice, int endPrice);

    List<Product> findByBrandIgnoreCase(String brand);

    List<Product> findByCategoryIgnoreCase(String category);

    List<Product> findByBrandAndCategoryIgnoreCase(String brand, String category);

    List<Product> findByTitleAndBrandAndCategoryIgnoreCase(String title, String brand, String category);
}
