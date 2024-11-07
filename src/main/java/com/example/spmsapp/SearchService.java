package com.example.spmsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchRepository searchRepository;

    public List<Employee> search(String query) {

        return searchRepository.findByNameStartingWith(query);
    }
}
