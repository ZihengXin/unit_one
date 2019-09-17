package com.company;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args){
        final double KG_TO_LBS=2.205;
        Scanner P= new Scanner(System.in);
        System.out.println("Type in the mass in Pounds");
        double lbs=P.nextDouble();
        double kg=lbs/KG_TO_LBS;
        System.out.println(lbs +" pounds = "+kg+ " kilograms");
    }
}
