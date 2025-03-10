package com.example.SearchService.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService personService;

    // POST: Add a new person
    @PostMapping
    public Product createPerson(@RequestBody Product person) {
        return personService.savePerson(person);
    }

    // GET: Get all persons
    @GetMapping
    public List<Product> getAllPersons() {
        return personService.getAllPersons();
    }

    // GET: Get a person by ID
    @GetMapping("/{id}")
    public Product getPersonById(@PathVariable String id) {
        return personService.getPersonById(id);
    }
}
