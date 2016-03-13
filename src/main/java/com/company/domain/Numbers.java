package com.company.domain;

import java.util.HashMap;
import java.util.Map;

public class Numbers {

    private Map<Integer, String> upToNineteen = new HashMap<Integer, String>() {{
        put(0, "zero");
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
        put(10, "ten");
        put(11, "eleven");
        put(12, "twelve");
        put(13, "thirteen");
        put(14, "fourteen");
        put(15, "fifteen");
        put(16, "sixteen");
        put(17, "seventeen");
        put(18, "eighteen");
        put(19, "nineteen");
    }};


    private Map<Integer, String> tensDigits = new HashMap<Integer, String>() {{
        put(2, "twenty");
        put(3, "thirty");
        put(4, "forty");
        put(5, "fifty");
        put(6, "sixty");
        put(7, "seventy");
        put(8, "eighty");
        put(9, "ninety");
    }};


    public String upToNineteen(int input) {
        return upToNineteen.get(input);
    }

    public String tensDigits(int input) {
        return tensDigits.get(input);
    }

}
