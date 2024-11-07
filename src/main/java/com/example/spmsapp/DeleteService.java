package com.example.spmsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void deleteEmployeeById(Integer id) {
        employeeRepository.deleteById( id);
    }



}
