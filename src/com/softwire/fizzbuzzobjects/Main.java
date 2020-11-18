package com.softwire.fizzbuzzobjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRules(FizzBuzz.DEFAULT_RULES);
        String[] values = fizzBuzz.run(255);
        Arrays.stream(values).forEach(System.out::println);
    }
}
