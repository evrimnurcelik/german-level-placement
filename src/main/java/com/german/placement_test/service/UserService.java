package com.german.placement_test.service;

import com.german.placement_test.model.User;
import com.german.placement_test.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final UserRepository userRepository;
  private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User registerUser(User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    return userRepository.save(user);
  }

  public User login(String email, String rawPassword) {
    User user = userRepository.findByEmail(email);
    if (user != null && passwordEncoder.matches(rawPassword, user.getPassword())) {
      return user;
    }
    return null;
  }
}
