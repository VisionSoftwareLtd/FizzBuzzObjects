package com.softwire.fizzbuzzobjects;

import java.util.List;

public class RuleBuzz implements Rule {
    @Override
    public void applyRule(int num, List<String> stringsToCombine) {
        if (num % 5 == 0) {
            stringsToCombine.add("Buzz");
        }
    }
}
