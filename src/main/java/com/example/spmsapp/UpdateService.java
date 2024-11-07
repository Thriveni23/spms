package com.example.spmsapp;// EmployeeService.java

import com.example.spmsapp.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }


    public void updateEmployee(Employee employee) {

        employeeRepository.save(employee);
    }
}
