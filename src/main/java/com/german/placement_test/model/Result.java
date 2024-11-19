package com.german.placement_test.model;

import javax.persistence.*;
import lombok.Data;
import java.time.LocalDateTime; 

@Entity
@Data
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private int score;
    private String level;
    private LocalDateTime dateTaken;
}