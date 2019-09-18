package com.company;

import java.util.Scanner;

public class AddOneTakeOne {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner input= new Scanner(System.in);
        int value= input.nextInt();
        value--;
        System.out.print(value+" ");
        value++;
        System.out.print(value+" ");
        value++;
        System.out.print(value+" ");

    }
}
