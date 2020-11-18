package com.softwire.fizzbuzzobjects;

import java.util.List;

public class RuleBong implements Rule {
    @Override
    public void applyRule(int num, List<String> stringsToCombine) {
        if (num % 11 == 0) {
            stringsToCombine.clear();
            stringsToCombine.add("Bong");
        }
    }
}
