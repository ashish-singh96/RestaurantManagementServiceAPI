package com.example.Restaurant.management.service.API.repo;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    // Add any specific queries if needed
}
