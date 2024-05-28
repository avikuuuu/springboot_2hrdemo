package com.avdesh.demo.controllers;


import com.avdesh.demo.dto.EmployeeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {

    @GetMapping("/employees/{id}")
//    public String getEmpolyee(){
//        return "hello world";
//    }
    public EmployeeDTO getEmpolyee(@PathVariable("id") int EmployeeID ){
        return  new EmployeeDTO(EmployeeID,"avdesh", LocalDate.of(2024,07,21),true);
    }

}
