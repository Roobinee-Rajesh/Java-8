package org.example.Generic.JavaEight;

import org.example.repo.Person;
import org.example.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class C_ConsumerInterface {
    public static void main(String[] args) {
        //Take input and return void
        Consumer<String> c1 = (s) -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println(s.toLowerCase());

        c1.accept("Roobinee");
        c2.accept("Roobi");

        Consumer<String> c3 = System.out::println;
        c1.andThen(c2).andThen(c3).accept("new");


        //Realtime example
        List<Person> personList = PersonRepository.getAllPersons();

        //Consumers
        System.out.println("Persons");
        Consumer<Person> personConsumer = person -> System.out.println(person.getName().toUpperCase());
        personList.forEach(personConsumer);
        System.out.println("Male Person");
        personList.forEach(person -> {
            if (person.getGender().equals("Male")) {
                personConsumer.accept(person);
            }
        });

        //Bi-Consumer
        BiConsumer<String, List<String>> biConsumer = (name, hobbies) -> {
            System.out.println("Name: " + name + " Hobbies: " + hobbies);
        };
        personList.forEach(person -> biConsumer.accept(person.getName(), person.getHobbies()));

    }



}



