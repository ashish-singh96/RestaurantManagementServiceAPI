package com.example.Restaurant.management.service.API.service;

@Service
public class FoodItemService {
    private final FoodItemRepository foodItemRepository;

    public FoodItemService(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    public FoodItem createFoodItem(FoodItem foodItem) {
        // Perform any necessary validations
        return foodItemRepository.save(foodItem);
    }

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    // Add other food item-related methods as required
}
