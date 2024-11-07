package com.example.spmsapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends JpaRepository<Employee, Long> {


    List<Employee> findByNameStartingWith(String name);


    void deleteByName(String name);


}
