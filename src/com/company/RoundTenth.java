package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main(String[] args){
        System.out.print("Decimal number? ");
        Scanner input=new Scanner(System.in);
        double input_number= input.nextDouble();
        input_number *=10;
        input_number +=0.5;
        int result= (int)(input_number);
        double outcome= result/10.0;
        System.out.print(input_number+" "+"rounded to the nearest tenth is"+" "+outcome);

    }
}
