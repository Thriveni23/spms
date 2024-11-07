package com.example.spmsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/search")
    public List<Employee> searchEmployees(@RequestParam(required = false) String query) {

        if (query == null || query.isEmpty()) {

            return Collections.emptyList();
        } else {
            return searchService.search(query);
        }
    }
 


}
