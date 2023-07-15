package com.example.Restaurant.management.service.API.service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> findAllUsersByRole(String role) {
        return userRepository.findAllByRole(role);
    }

    // Add other user-related methods as required
}
