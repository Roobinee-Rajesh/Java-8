package org.example.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {
    public static List<Person> getAllPersons() {
        Person p1 = new Person("Roobinee", "Female", 165, 2, 50000,
                Arrays.asList("Dancing", "Swimming", "Singing"));
        Person p2 = new Person("Barath", "Male", 185, 12, 40000,
                Arrays.asList("Driving", "Playing", "Singing"));
        Person p3 = new Person("Dharun", "Male", 155, 1, 60000,
                Arrays.asList("Quotes", "Swimming", "Coding"));

        return Arrays.asList(p1, p2, p3);
    }
}
