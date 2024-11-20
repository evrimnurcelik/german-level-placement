package com.german.placement_test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String questionText;
  private String level; // A1, A2, B1, B2, C1, C2
  private String options; // JSON or comma-separated values
  private String correctOption;
}
