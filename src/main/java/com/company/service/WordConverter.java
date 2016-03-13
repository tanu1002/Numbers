package com.company.service;

import com.company.domain.Hundreds;
import com.company.domain.Millions;
import com.company.domain.Thousands;

import java.util.List;

import static com.sun.deploy.util.StringUtils.join;

public class WordConverter {

    private final Hundreds hundreds = new Hundreds();
    private final Thousands thousands = new Thousands();
    private final Millions millions = new Millions();


    public String convert(int input) {
        List<String> tokens = getTokens(input);
        String result = join(tokens, " ");
        return result;
    }

    public List<String> getTokens(int input) {
        if (input < 100) {
            return hundreds.upToHundred(input);
        }
        if (input < 1000) {
            return thousands.upToThousandsWithAnd(input);
        }
        if (input < 1000000) {
            return millions.upToMillion(input);
        }
        if (input <= 999999999) {
            return millions.moreThanMillion(input);
        }
        throw new RuntimeException("We don't support word conversion for numbers larger than 999999999 : failing for " + input);
    }



}
