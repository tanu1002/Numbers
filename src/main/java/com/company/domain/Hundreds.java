package com.company.domain;

import java.util.ArrayList;
import java.util.List;


public class Hundreds {

    private final Numbers numbers = new Numbers();

    public List<String> upToHundred(int input) {
        List<String> result = new ArrayList<>();
        if (input < 20) {
            result.add(numbers.upToNineteen(input));
        } else {
            twentyToNinetyNine(input, result);
        }
        return result;
    }

    private void twentyToNinetyNine(int input, List<String> result) {
        int firstDigit = input / 10;
        int secondDigit = input % 10;
        if (firstDigit != 0) {
            result.add(numbers.tensDigits(firstDigit));
        }
        if (secondDigit != 0) {
            result.add(numbers.upToNineteen(secondDigit));
        }
    }
}
