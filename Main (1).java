// Programmers: Constantinos Marmaras, Cynthia Somers
// Course:  CS 212, Mr. John
// Due Date: 1/28/24
// Lab 1
// Problem Statement: Calculate grocery cost given items, units, and price per unit
// Input: item names, units, and price for items 1 and 2
// Output: the cost of both items 1 and 2 and total cost
// Credits:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This will calculate how much your grocerys will cost");
        
        System.out.println("What is the name of item 1?");
        String item1Name = input.nextLine();
        
        System.out.println("How many units of item 1 are you buying?");
        int item1Units = input.nextInt();
        
        System.out.println("How much does item 1 cost per unit?");
        double item1Cost = input.nextDouble();
        
        input.nextLine();
        System.out.println("What is the name of item 2?");
        String item2Name = input.nextLine();
        
        System.out.println("How many units of item 2 are you buying?");
        int item2Units = input.nextInt();
        
        System.out.println("How much does item 2 cost per unit?");
        double item2Cost = input.nextDouble();
        
        double item1Total = item1Cost * item1Units;
        double item2Total = item2Cost * item2Units;
        
        System.out.println(item1Name + " @ " + item1Cost + " x " + item1Units +" = " +item1Total);
        System.out.println(item2Name + " @ " + item2Cost + " x " +item2Units +" = " +item2Total);
        
        double totalPrice = item1Total + item2Total;
        
        System.out.println("TOTAL COST = " + totalPrice);
        
    }
}
