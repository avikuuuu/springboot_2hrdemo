package com.avdesh.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDTO {
    private int id;
    private String name;
    private LocalDate dataOfJoining;
    private boolean isActive;
}
