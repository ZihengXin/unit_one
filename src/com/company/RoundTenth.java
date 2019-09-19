package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main(String[] args){
        System.out.print("Decimal number? ");
        Scanner input=new Scanner(System.in);
        double input_number= input.nextDouble();
        double progress= input_number;
        progress *=10;
        progress +=0.5;
        int result= (int)(progress);
        double outcome= result/10.0;
        System.out.print(input_number+" "+"rounded to the nearest tenth is"+" "+outcome);

    }
}
