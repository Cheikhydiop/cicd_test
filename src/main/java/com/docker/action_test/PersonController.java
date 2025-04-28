package com.docker.action_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public List<Object> getPersons() {
        List<Object> persons = new ArrayList<>();

        // Créer des objets représentant des personnes avec leur nom et âge
        persons.add(new Object() {
            public String name = "John Doe";
            public int age = 30;
        });
        persons.add(new Object() {
            public String name = "Jane Doe";
            public int age = 25;
        });
        persons.add(new Object() {
            public String name = "Alice Smith";
            public int age = 28;
        });

        return persons;
    }
}
