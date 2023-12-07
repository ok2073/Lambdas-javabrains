package com.keelient.unit3;

import com.keelient.common.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("\nUsing for in loop");
        for (Person p: people) {
            System.out.println(p);
        }

        System.out.println("\nUsing lambda foreach loop");
        people.forEach(p -> System.out.println(p)); // or System.out::println
    }

}
