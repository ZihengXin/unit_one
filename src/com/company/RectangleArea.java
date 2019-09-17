package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner Ahri= new Scanner (System.in);
        Scanner Annie= new Scanner (System.in);
        System.out.println("Type in the length in numbers: ");
        Double length = Ahri.nextDouble();
        System.out.println("Type in the width: ");
        Double width = Annie.nextDouble();
        Double area = length * width;
        System.out.print("Area = ");
        System.out.print(area);
    }
}
