package com.company.service;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class WordConverterTest {

    private final WordConverter wordConverter = new WordConverter();

    @Test
    public void convertSingleDigit() throws Exception {
        assertThat(wordConverter.convert(0), Is.is("zero"));
        assertThat(wordConverter.convert(1), Is.is("one"));
        assertThat(wordConverter.convert(9), Is.is("nine"));
    }

    @Test
    public void convertTenToNineteenDigit() throws Exception {
        assertThat(wordConverter.convert(10), Is.is("ten"));
        assertThat(wordConverter.convert(11), Is.is("eleven"));
        assertThat(wordConverter.convert(19), Is.is("nineteen"));
    }

    @Test
    public void convertTwoDigit() throws Exception {
        assertThat(wordConverter.convert(20), Is.is("twenty"));
        assertThat(wordConverter.convert(21), Is.is("twenty one"));
        assertThat(wordConverter.convert(27), Is.is("twenty seven"));
        assertThat(wordConverter.convert(99), Is.is("ninety nine"));
    }

    @Test
    public void convertThreeDigit() throws Exception {
        assertThat(wordConverter.convert(100), Is.is("one hundred"));
        assertThat(wordConverter.convert(105), Is.is("one hundred and five"));
        assertThat(wordConverter.convert(123), Is.is("one hundred and twenty three"));
        assertThat(wordConverter.convert(999), Is.is("nine hundred and ninety nine"));
    }

    @Test
    public void convertFourDigit() throws Exception {
        assertThat(wordConverter.convert(1000), Is.is("one thousand"));
        assertThat(wordConverter.convert(1005), Is.is("one thousand and five"));
        assertThat(wordConverter.convert(1042), Is.is("one thousand and forty two"));
    }

    @Test
    public void convertFiveDigit() throws Exception {
        assertThat(wordConverter.convert(10000), Is.is("ten thousand"));
        assertThat(wordConverter.convert(10005), Is.is("ten thousand and five"));
        assertThat(wordConverter.convert(10042), Is.is("ten thousand and forty two"));
    }

    @Test
    public void convertSixDigit() throws Exception {
        assertThat(wordConverter.convert(100000), Is.is("one hundred thousand"));
        assertThat(wordConverter.convert(100005), Is.is("one hundred thousand and five"));
        assertThat(wordConverter.convert(100042), Is.is("one hundred thousand and forty two"));
    }

    @Test
    public void convertMillions() throws Exception {
        assertThat(wordConverter.convert(56945781), Is.is("fifty six million nine hundred and forty five thousand seven hundred and eighty one"));
        assertThat(wordConverter.convert(999999999), Is.is("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine"));
    }

    @Test(expected = RuntimeException.class)
    public void convertUnsupported() throws Exception {
        wordConverter.convert(1999999999);
    }

}