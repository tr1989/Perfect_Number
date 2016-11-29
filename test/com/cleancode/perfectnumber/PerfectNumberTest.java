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
        Assert.assertTrue(expected);
    }
}