package org.example.Generic.JavaEight;

import org.example.repo.Person;
import org.example.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class F_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> predicateLessThan=a->a>50;

        System.out.println(predicateLessThan.test(20));
        System.out.println(predicateLessThan.test(70));

        List<Person> personList= PersonRepository.getAllPersons();

        //Predicate
        System.out.println("Predicate");
        Predicate<Person> predicateHeigh=person->person.getHeight()>140;
        Predicate<Person> predicateGender=person->person.getGender().equals("Male");
        personList.forEach(person -> {
            if (predicateHeigh.and(predicateGender).test(person))
            {
                System.out.println(person.getName() + " "+person.getHeight()+" "+person.getGender());
            }
        });

        //Bi-Predicate
        System.out.println("BiPredicate");
        BiPredicate<Integer,String> biPredicate=(height,gender)->
            height>140 && gender.equals("Male") ;
        personList.forEach(person -> {
            if (biPredicate.test(person.getHeight(),person.getGender()))
            {
                System.out.println(person.getName() + " "+person.getHeight()+" "+person.getGender());
            }
        });

        //Bi-predicate and Bi-Consumer
        BiPredicate<Integer,String> biConsumerBiPredicate=(height,gender)->
                height>140 && gender.equals("Male") ;
        BiConsumer<String, List<String>> biConsumer = (name, hobbies) -> {
            System.out.println("Name: " + name + " Hobbies: " + hobbies);
        };
        personList.forEach(person -> {
            if (biConsumerBiPredicate.test(person.getHeight(),person.getGender()))
            {
                biConsumer.accept(person.getName(),person.getHobbies());
            }
        });


    }
}
