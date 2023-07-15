package com.example.Restaurant.management.service.API.model;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int quantity;

    private String status;

    // Getters and setters
}
