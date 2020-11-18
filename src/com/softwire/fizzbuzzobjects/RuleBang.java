package com.softwire.fizzbuzzobjects;

import java.util.List;

public class RuleBang implements Rule {
    @Override
    public void applyRule(int num, List<String> stringsToCombine) {
        if (num % 7 == 0) {
            stringsToCombine.add("Bang");
        }
    }
}
