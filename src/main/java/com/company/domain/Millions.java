package com.company.domain;

import static com.company.domain.Constants.MILLION;
import static com.company.domain.Constants.THOUSAND;

import java.util.ArrayList;
import java.util.List;

public class Millions {

    private final Thousands thousands = new Thousands();

    public  List<String> upToMillion(int input) {
        int first = input / 1000;
        int second = input % 1000;
        List<String> result = new ArrayList<>();
        result.addAll(thousands.upToThousandOptionalAnd(first));
        result.add(THOUSAND);
        result.addAll(thousands.upToThousandsWithAnd(second));
        return result;
    }


    public  List<String> moreThanMillion(int input) {
        int first = input / 1000_000;
        int second = input % 1000_000;
        List<String> result = new ArrayList<>();
        result.addAll(thousands.upToThousandOptionalAnd(first));
        result.add(MILLION);
        result.addAll(upToMillion(second));
        return result;
    }

}
