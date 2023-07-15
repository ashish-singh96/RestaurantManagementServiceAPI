package com.example.Restaurant.management.service.API.model;

@Entity
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private double price;

    private String dummyImageUrl;

    // Getters and setters
}
