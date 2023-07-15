package com.example.Restaurant.management.service.API.controller;

@RestController
@RequestMapping("/api")
public class RestaurantController {
    private final UserService userService;
    private final FoodItemService foodItemService;
    private final OrderService orderService;

    public RestaurantController(UserService userService, FoodItemService foodItemService, OrderService orderService) {
        this.userService = userService;
        this.foodItemService = foodItemService;
        this.orderService = orderService;
    }

    // User API endpoints
    // Add API endpoints for user signup, signin, and other user operations

    // FoodItem API endpoints
    @PostMapping("/fooditems")
    public ResponseEntity<FoodItem> createFoodItem(@RequestBody FoodItem foodItem) {
        FoodItem createdFoodItem = foodItemService.createFoodItem(foodItem);
        return ResponseEntity.ok(createdFoodItem);
    }

    @GetMapping("/fooditems")
    public ResponseEntity<List<FoodItem>> getAllFoodItems() {
        List<FoodItem> foodItems = foodItemService.getAllFoodItems();
        return ResponseEntity.ok(foodItems);
    }

    // Order API endpoints
    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.createOrder(order);
        return ResponseEntity.ok(createdOrder);
    }

    @GetMapping("/orders/{userId}")
    public ResponseEntity<List<Order>> getAllOrdersByUser(@PathVariable Long userId) {
        User user = userService.findById(userId);
        if (user != null) {
            List<Order> orders = orderService.getAllOrdersByUser(user);
            return ResponseEntity.ok(orders);
        }
        return ResponseEntity.notFound().build();
    }

    // Add other API endpoints as required
}
