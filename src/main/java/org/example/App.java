/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Enter the price of item 1: ");
        double item1 = checkDouble(scanner.nextLine());
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = checkInt(scanner.nextLine());
        System.out.print("Enter the price of item 2: ");
        double item2 = checkDouble(scanner.nextLine());
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = checkInt(scanner.nextLine());
        System.out.print("Enter the price of item 3: ");
        double item3 = checkDouble(scanner.nextLine());
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = checkInt(scanner.nextLine());

        double subtotal = (item1 * quantity1) + (item2 * quantity2) + (item3 * quantity3);
        double tax = subtotal * 0.055;
        double total = tax + subtotal;
        System.out.println("Subtotal: $" + df.format(subtotal) + "\nTax: $" + df.format(tax) +
                "\nTotal: $" + df.format(total));

    }

    public static int checkInt(String inputStr) {
        String inputToCheck = inputStr;
        int input = 0;

        input = Integer.parseInt(inputToCheck);
        return input;
    }

    public static double checkDouble(String inputStr) {
        String inputToCheck = inputStr;
        double input = 0;

        input = Double.parseDouble(inputToCheck);

        return input;


    }
}
