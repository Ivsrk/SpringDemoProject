package com.freshworks.demo.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController


public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Welcome to the Application";
    }
    @GetMapping("/itha")
    public String tellName(){
        return "itha";
    }
    @GetMapping("/employee/{empId}")
    public EmployeeEntity getEmployeeDetails(@PathVariable(name="empId") Long employeeId, @RequestParam("search") String searchName){

        return employeeService.getEmployeeById(employeeId);
    }
}
