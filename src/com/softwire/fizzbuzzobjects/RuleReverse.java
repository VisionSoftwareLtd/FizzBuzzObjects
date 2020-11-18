package com.softwire.fizzbuzzobjects;

import java.util.Collections;
import java.util.List;

public class RuleReverse implements Rule {
    @Override
    public void applyRule(int num, List<String> stringsToCombine) {
        if (num % 17 == 0) {
            Collections.reverse(stringsToCombine);
        }
    }
}
