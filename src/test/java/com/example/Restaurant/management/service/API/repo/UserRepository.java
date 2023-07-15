package com.example.Restaurant.management.service.API.repo;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAllByRole(String role);
}
