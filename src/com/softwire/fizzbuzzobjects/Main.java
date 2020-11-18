package com.softwire.fizzbuzzobjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRules(FizzBuzz.DEFAULT_RULES);
        String[] rules = fizzBuzz.run(255);
        Arrays.stream(rules).forEach(System.out::println);
    }
}
