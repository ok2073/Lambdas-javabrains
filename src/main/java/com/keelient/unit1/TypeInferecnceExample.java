package com.keelient.unit1;

public class TypeInferecnceExample {
    public static void main(String[] args) {
        printLambda(s -> s.length());
    }

    private static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello Lambda"));
    }
}

interface StringLengthLambda {
    int getLength(String s);
}
