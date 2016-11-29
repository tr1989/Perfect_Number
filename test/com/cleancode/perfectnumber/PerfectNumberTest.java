package com.cleancode.perfectnumber;

import org.junit.Assert;
import org.junit.Test;

public class PerfectNumberTest {
    @Test
    public void testIsNumberPositive(){
        PerfectNumber perfectNumber = new PerfectNumber();
        int number = 5;
        boolean expected = perfectNumber.isNumberPositive(number);
        Assert.assertTrue(expected);
    }

    @Test
    public void testIsNumberPositiveFailure(){
        PerfectNumber perfectNumber = new PerfectNumber();
        int number = -5;
        boolean expected = perfectNumber.isNumberPositive(number);
        Assert.assertFalse(expected);
    }

    @Test
    public void testIsNumberZero(){
        PerfectNumber perfectNumber = new PerfectNumber();
        int number = 0;
        boolean expected = perfectNumber.isNumberZero(number);
        Assert.assertTrue(expected);
    }

    @Test
    public void testGetSumOfFactors(){
        PerfectNumber perfectNumber = new PerfectNumber();
        int number = 6;
        int sum = perfectNumber.getSumOfFactors(number);
        Assert.assertNotNull(sum);
    }

    @Test
    public void testIsNumberPerfect(){
        PerfectNumber perfectNumber = new PerfectNumber();
        int number = 6;
        boolean expected = perfectNumber.isNumberPerfect(number);
        Assert.assertTrue(expected);
    }

    @Test
    public void testIsNumberPerfectWithValue10(){
        PerfectNumber perfectNumber = new PerfectNumber();
        int number = 10;
        boolean expected = perfectNumber.isNumberPerfect(number);
        Assert.assertFalse(expected);
    }

    @Test
    public void testIsNumberPerfectWithValueZero(){
        PerfectNumber perfectNumber = new PerfectNumber();
        int number = 0;
        boolean expected = perfectNumber.isNumberPerfect(number);
        Assert.assertFalse(expected);
    }
}