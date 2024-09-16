package UnitOne;

import java.text.NumberFormat;
// Imports
import java.util.Scanner;

public class FinalCostLoop {
    public static void main(String[] args) {

        // Variables and objects
        int counter = 0, itemNum;
        double total=0, itemCost, tax = .13, hst;

        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        // Tells user what the program does
        System.out.print("This program allows you to input the amount of items you are purchasing and then output the price with HST and then add it to a total at the end");

        // Get user to input how many items they want to calculate the total price of
        System.out.print("\nHow many items would you like to get the total price of with a HST of " + percent.format(tax) + ": ");
        itemNum = input.nextInt();
        input.nextLine();

        // Initialize total outside the loop
        total = 0;

        while (counter < itemNum) {
            // Add 1 to the counter
            counter++;

            // Get value of item
            System.out.print("\nWhat is the price of item " + counter + ": $");
            itemCost = input.nextDouble();
            input.nextLine();

            // Calculations
            hst = itemCost * tax;
            total += itemCost + hst;

            // Output calculated values for each item
            System.out.println("Subtotal: " + currency.format(itemCost));
            System.out.println("HST(" + percent.format(tax) + "): " + currency.format(hst));
            System.out.println("Item Total: " + currency.format(itemCost + hst));
        }

        // Output the final total after the loop
        System.out.println("\nFinal Total: " + currency.format(total));
        System.out.println("You purchased " + itemNum + " items");

        System.out.println("\nThank you for using my program\n");

    }
}
