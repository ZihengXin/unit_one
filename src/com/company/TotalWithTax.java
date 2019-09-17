package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main(String[] args){
        System.out.println("Type in the price of the goods");
        Scanner Yasuo=new Scanner(System.in);
        final double TAXRARE= 0.0825;
        double price;
        double tax;
        double total;
        price=Yasuo.nextDouble();
        tax=price*TAXRARE;
        total= price+tax;
        System.out.println("Price: $"+price);
        System.out.println("Sale Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}
