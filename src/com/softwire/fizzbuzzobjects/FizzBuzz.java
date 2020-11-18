package com.softwire.fizzbuzzobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static final Rule[] DEFAULT_RULES = new Rule[] {
            new RuleFizz(),
            new RuleBuzz(),
            new RuleBang(),
            new RuleBong(),
            new RuleFezz(),
            new RuleReverse()
    };

    private List<Rule> rules = new ArrayList<>();

    public void addRules(Rule... rulesToAdd) {
        rules.addAll(Arrays.asList(rulesToAdd));
    }

    public String[] run(int maxNum) {
        String[] fizzBuzzValues = new String[maxNum + 1];
        for (int i = 1; i <= maxNum; i++) {
            fizzBuzzValues[i] = applyAllRules(i);
        }
        return fizzBuzzValues;
    }

    private String applyAllRules(int num) {
        List<String> stringsToCombine = new ArrayList<>();
        for (Rule rule : rules) {
            rule.applyRule(num, stringsToCombine);
        }
        if (stringsToCombine.size() == 0)
            return Integer.toString(num);
        return String.join("", stringsToCombine);
    }
}
