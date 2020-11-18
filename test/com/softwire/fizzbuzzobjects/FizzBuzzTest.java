package com.softwire.fizzbuzzobjects;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRules(FizzBuzz.DEFAULT_RULES);

        fizzTest(fizzBuzz);
        buzzTest(fizzBuzz);
        fizzBuzzTest(fizzBuzz);
        bongTest(fizzBuzz);
        fezzTest(fizzBuzz);
        reverseTest(fizzBuzz);
        System.out.println("All tests passed");
    }

    private static void fizzTest(FizzBuzz fizzBuzz) {
        String[] values = fizzBuzz.run(6);
        assert(values[1].equals("1"));
        assert(values[3].equals("Fizz"));
        assert(values[6].equals("Fizz"));
    }

    private static void buzzTest(FizzBuzz fizzBuzz) {
        String[] values = fizzBuzz.run(10);
        assert(values[5].equals("Buzz"));
        assert(values[10].equals("Buzz"));
    }

    private static void fizzBuzzTest(FizzBuzz fizzBuzz) {
        String[] values = fizzBuzz.run(15);
        assert(values[9].equals("Fizz"));
        assert(values[10].equals("Buzz"));
        assert(values[15].equals("FizzBuzz"));
    }

    private static void bongTest(FizzBuzz fizzBuzz) {
        String[] values = fizzBuzz.run(33);
        assert(values[11].equals("Bong"));
        assert(values[33].equals("Bong"));
    }

    private static void fezzTest(FizzBuzz fizzBuzz) {
        String[] values = fizzBuzz.run(195);
        assert(values[13].equals("Fezz"));
        assert(values[195].equals("FizzFezzBuzz"));
        assert(values[143].equals("FezzBong"));
    }

    private static void reverseTest(FizzBuzz fizzBuzz) {
        String[] values = fizzBuzz.run(255);
        assert(values[255].equals("BuzzFizz"));
    }
}
