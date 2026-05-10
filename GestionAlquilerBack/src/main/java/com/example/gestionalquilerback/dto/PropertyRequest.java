package com.example.gestionalquilerback.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class PropertyRequest {
    @NotBlank
    private String name;
    private String address;
    private String description;
    private BigDecimal monthlyRent;
}
