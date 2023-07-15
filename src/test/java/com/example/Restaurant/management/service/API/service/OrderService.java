package com.example.Restaurant.management.service.API.service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        // Perform any necessary validations
        return orderRepository.save(order);
    }

    public List<Order> getAllOrdersByUser(User user) {
        return orderRepository.findAllByUser(user);
    }

    // Add other order-related methods as required
}
