package com.example.spmsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DeleteService deleteService;

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

        Employee savedEmployee = employeeRepository.save(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }


    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        deleteService.deleteEmployeeById(id);
    }





}
