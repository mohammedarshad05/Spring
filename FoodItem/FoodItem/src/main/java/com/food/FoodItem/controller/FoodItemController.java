package com.food.FoodItem.controller;

import com.food.FoodItem.model.FoodItem;
import com.food.FoodItem.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodItem")
public class FoodItemController {

    private final FoodItemService foodItemService;

    @Autowired

    public FoodItemController(FoodItemService foodItemService ) {
        this.foodItemService = foodItemService;
    }

    @GetMapping
    public List<FoodItem> getFoodItems() {
        return foodItemService.getFoodItems();
    }
}
