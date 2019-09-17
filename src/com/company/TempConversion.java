package com.company;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args){
        System.out.println("Type in the Temp in Fahrenheit");
        Scanner Neeko = new Scanner(System.in);
        double Fahrenheit;
        double Celsius;
        Fahrenheit=Neeko.nextDouble();
        Celsius=(Fahrenheit-32)/(1.8);
        System.out.println("Celsius = "+Celsius);

    }
}
