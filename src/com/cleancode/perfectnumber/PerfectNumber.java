package com.cleancode.perfectnumber;

public class PerfectNumber{

    public  boolean isNumberPositive(int number){
        if(number > 0){
            return true;
        }
        return false;
    }

    public  boolean isNumberZero(int number){
        if(number == 0){
            return true;
        }
        return false;
    }

    public int getSumOfFactors(int number) {
        int sum = 0;
        for (int counter = 1; counter <= number / 2; counter++) {
            if (number % counter == 0) {
                sum += counter;
            }
        }
        return sum;
    }

}