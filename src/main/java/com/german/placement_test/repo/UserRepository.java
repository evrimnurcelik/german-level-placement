package com.german.placement_test.repo;

import com.german.placement_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);

  User findByEmail(String email);
}
