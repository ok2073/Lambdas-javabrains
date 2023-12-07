package com.keelient.unit3;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        //(MethodReferenceExample1::printMessage is the same of () -> System.out.println("Hello")
        Thread thread = new Thread(MethodReferenceExample1::printMessage);
        thread.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
