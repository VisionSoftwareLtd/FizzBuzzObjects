package com.softwire.fizzbuzzobjects;

import java.util.List;

public class RuleFizz implements Rule {
    @Override
    public void applyRule(int num, List<String> stringsToCombine) {
        if (num % 3 == 0) {
            stringsToCombine.add("Fizz");
        }
    }
}
