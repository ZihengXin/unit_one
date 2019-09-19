package com.company;

import java.util.Scanner;

public class RoundNegatives {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a negative decimal number: ");
        double input_number= input.nextDouble();
        int result=(int)(input_number-0.5);
        System.out.println(input_number+" rounded to a whole number is "+result);


    }
}
