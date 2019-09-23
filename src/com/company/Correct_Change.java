/* 9/23 Charly (Ziheng Xin)
We are working on the the program which can convert any numbers of cents into dollars, quarters,dimes,nickles, and cents.
 */
package com.company;

import java.util.Scanner;

public class Correct_Change {
    public static void main(String[] args){
        System.out.println("Please enter a whole number of cents: ");
        Scanner number_of_cents=new Scanner(System.in);
        // The program below is converting the number of cents into the change we want.
        int input= number_of_cents.nextInt();
        int dollar= input/100;//number of dollars
        int rest_dollar= input%100;
        int quarter= rest_dollar/25;//number of quarters
        int rest_quarter= rest_dollar%25;
        int dime= rest_quarter/10;//number of dimes
        int rest_dime= rest_quarter%10;
        int nickel= rest_dime/5;//number of nickels
        int rest_nickel= rest_dime%5;
        int pennie= rest_nickel;//number of cents
        System.out.print("You have "+dollar+" dollars, "+quarter+" quarter, "+dime+" dimes, "+nickel+" nickels, and "
                +pennie+" pennies.");
    }
}
