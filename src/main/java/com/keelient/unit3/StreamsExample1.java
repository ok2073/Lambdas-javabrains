package com.keelient.unit3;

import com.keelient.common.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );


        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p)); //.forEach(System.out::println);

        Stream<Person> stream = people.stream();

        long startTime = System.nanoTime();
        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();
        long endTime = System.nanoTime();
        long durationInNanos = endTime - startTime;
        double durationInSeconds = durationInNanos / 1e9; // Convert nanoseconds to seconds
        double percentageOfSecond = (durationInSeconds / 1) * 100; // Calculate percentage
        System.out.println("count: " + count);
        System.out.println("Execution time (count): " + durationInNanos + " nanoseconds, which is " + percentageOfSecond + "% of a second");

        startTime = System.nanoTime();
        long countParallel = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();
        endTime = System.nanoTime();
        durationInNanos = endTime - startTime;
        durationInSeconds = durationInNanos / 1e9; // Convert nanoseconds to seconds
        percentageOfSecond = (durationInSeconds / 1) * 100; // Calculate percentage
        System.out.println("countParallel: " + count);
        System.out.println("Execution time (countParallel): " + durationInNanos + " nanoseconds, which is " + percentageOfSecond + "% of a second");
    }
}
