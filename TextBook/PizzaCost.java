// Page 99 - Exercise 2

package TextBook;

import java.text.NumberFormat;
// Import libraries
import java.util.Scanner;

public class PizzaCost {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // Variables for cost of making a pizza at a local shop
        double labor = 0.75, materials, totalCost;
        int diameter, rent = 1;
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // Input from user on the size of the pizza
        System.out.print("Enter the diameter of the pizza in inches: ");
        diameter = input.nextInt();

        // Equations to find material cost and total cost for the pizza with the input diameter from the user
        materials = 0.05*Math.pow(diameter,2);
        totalCost = labor + materials + rent;

        // Print total cost to user
        System.out.print("The cost of making the pizza is: " + currency.format(totalCost));
    }
}
