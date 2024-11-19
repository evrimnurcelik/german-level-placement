package com.german.placement_test.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt;
}