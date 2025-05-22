package com.food.FoodItem.repository;

import com.food.FoodItem.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
