package com.example.Restaurant.management.service.API.repo;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByUser(User user);
    // Add any specific queries if needed
}
