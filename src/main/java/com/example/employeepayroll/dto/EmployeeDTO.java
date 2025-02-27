
package com.example.employeepayroll.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Generates Getters, Setters, toString(), equals(), and hashCode()
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;  // Use Long to match with the Entity

    @NotBlank(message = "Name is required and cannot be empty")
    @Pattern(regexp = "^[A-Za-z ]{3,50}$", message = "Name must contain only letters and spaces(3-50 characters)")
    private String name;

    private double salary;
}