package com.company.domain;

import java.util.ArrayList;
import java.util.List;

import static com.company.domain.Constants.AND;
import static com.company.domain.Constants.HUNDRED;

public class Thousands {

    private final Numbers numbers = new Numbers();
    private final Hundreds hundreds = new Hundreds();

    public List<String> upToThousandsWithAnd(int input) {
        int firstDigit = input / 100;
        int others = input % 100;
        List<String> result = new ArrayList<>();
        if (firstDigit != 0) {
            result.add(numbers.upToNineteen(firstDigit));
            result.add(HUNDRED);
        }
        if (others != 0) {
            result.add(AND);
            result.addAll(hundreds.upToHundred(others));
        }
        return result;
    }

    public List<String> upToThousandOptionalAnd(int input) {
        int firstDigit = input / 100;
        int others = input % 100;
        List<String> result = new ArrayList<>();
        if (firstDigit != 0) {
            result.add(numbers.upToNineteen(firstDigit));
            result.add(HUNDRED);
        }

        if (firstDigit != 0 && others != 0) {
            result.add(AND);
        }

        if (others != 0) {
            result.addAll(hundreds.upToHundred(others));
        }
        return result;
    }


}
