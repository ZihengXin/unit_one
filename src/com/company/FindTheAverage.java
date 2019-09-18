package com.company;

import java.util.Scanner;

public class FindTheAverage {
    public static void main(String[] args){
        System.out.println("Enter four values. ");
        System.out.println("Value 1: ");
        Scanner input= new Scanner(System.in);
        double value_one= input.nextDouble();
        System.out.println("Value 2: ");
        double value_two= input.nextDouble();
        System.out.println("Value 3: ");
        double value_three= input.nextDouble();
        System.out.println("Value 4: ");
        double value_four= input.nextDouble();
        double result=0;
        result += value_one;
        result += value_two;
        result += value_three;
        result += value_four;

        System.out.println("Average = "+ result);
    }
}
