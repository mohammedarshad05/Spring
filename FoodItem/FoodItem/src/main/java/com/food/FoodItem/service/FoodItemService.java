package com.food.FoodItem.service;

import com.food.FoodItem.model.FoodItem;
import com.food.FoodItem.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    private FoodItemRepository foodItemRepository;

    @Autowired

    public FoodItemService(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    public List<FoodItem> getFoodItems(){
        return foodItemRepository.findAll();
    }
}
