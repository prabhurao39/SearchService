package com.example.SearchService.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository personRepository;

    // Save a Person to MongoDB
    public Product savePerson(Product person) {
        return personRepository.save(person);
    }

    // Get all Persons from MongoDB
    public List<Product> getAllPersons() {
        return personRepository.findAll();
    }

    // Find a Person by ID
    public Product getPersonById(String id) {
        return personRepository.findById(id).orElse(null);
    }
}
