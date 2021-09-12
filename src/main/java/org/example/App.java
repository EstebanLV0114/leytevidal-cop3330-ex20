package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amount;

        System.out.print("What is order amount? ");
        amount = Integer.parseInt(input.nextLine());
        System.out.print("What state do you live in? ");
        String ST = input.nextLine();

        if (ST.equalsIgnoreCase("wisconsin"))
        {
            System.out.print("What county do you live in? ");
            String CTRY = input.nextLine();

            if (CTRY.equalsIgnoreCase("eau claire"))
            {
                double tax, finalAmount;

                tax = (amount*5.005)/100;
                finalAmount = tax + amount;
                System.out.println("The tax is  $" + String.format("%.2f", tax));
                System.out.println("The total is  $" + String.format("%.2f", finalAmount));
            }
            else if(CTRY.equalsIgnoreCase("dunn"))
            {
                double tax, finalAmount;

                tax = (amount*5.004)/100;
                finalAmount = tax + amount;

                System.out.println("The tax is  $" + String.format("%.2f", tax));
                System.out.println("The total is  $" + String.format("%.2f", finalAmount));
            }

            else

            {
                System.out.println("Please enter correct county");
            }

        }

        else if(ST.equalsIgnoreCase("illinois"))

        {
            double tax, finalAmount;

            tax = ((double)amount*8)/100;
            finalAmount = tax + amount;

            System.out.println("The tax is  $" + String.format("%.2f", tax));
            System.out.println("The total is  $" + String.format("%.2f", finalAmount));
        }
        else
        {
            double tax, finalAmount;

            tax = 0.0;
            finalAmount = amount;
            System.out.println("The tax is  $" + String.format("%.2f", tax));
            System.out.println("The total is  $" + String.format("%.2f", finalAmount));
        }


    }
}
