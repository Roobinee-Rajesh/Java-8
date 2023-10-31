package org.example.repo;

import org.example.repo.Address;

import java.util.List;
import java.util.Optional;

public class Person {
    private String name,gender;
    private int height,kids;
    private double salary;
    private List<String> hobbies;
    private Optional<Address> address;


    public Person(String name, String gender, int height, int kids, double salary, List<String> hobbies) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.kids = kids;
        this.salary = salary;
        this.hobbies = hobbies;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public int getKids() {
        return kids;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
