package com.freshworks.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity getEmployeeById(Long Id) {
        return employeeRepository.findById(Id).get();
    }
}
