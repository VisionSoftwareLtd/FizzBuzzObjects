package com.softwire.fizzbuzzobjects;

import java.util.ArrayList;
import java.util.List;

public class RuleFezz implements Rule {
    @Override
    public void applyRule(int num, List<String> stringsToCombine) {
        if (num % 13 == 0) {
            List<String> stringsBackup = new ArrayList<>(stringsToCombine);
            stringsToCombine.clear();
            boolean foundB = false;
            for (String s : stringsBackup) {
                if (!foundB && s.startsWith("B")) {
                    foundB = true;
                    stringsToCombine.add("Fezz");
                }
                stringsToCombine.add(s);
            }
            if (!foundB) {
                stringsToCombine.add("Fezz");
            }
        }
    }
}
