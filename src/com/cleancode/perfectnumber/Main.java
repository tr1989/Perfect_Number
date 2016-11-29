package com.cleancode.perfectnumber;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("It starts here.");
        System.out.println("Please enter a number ::");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        PerfectNumber perfectNumber = new PerfectNumber();

        boolean isPerfect = perfectNumber.isNumberPerfect(number);
        if(isPerfect){
            System.out.println(number +" is a perfect number.");
        }else{
            System.out.println(number +" is not a perfect number.");
        }

    }
}