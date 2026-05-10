package com.example.gestionalquilerback.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class PropertyResponse {
    private Long id;
    private String name;
    private String address;
    private String description;
    private BigDecimal monthlyRent;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
