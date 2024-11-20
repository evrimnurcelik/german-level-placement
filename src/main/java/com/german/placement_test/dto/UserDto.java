package com.german.placement_test.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserDto {
  private Long id;
  private String username;
  private String password;
  private String email;
  private LocalDateTime createdAt;
}
