package com.german.placement_test.repo;

import com.german.placement_test.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
  List<Result> findByUserId(Long userId);
}
