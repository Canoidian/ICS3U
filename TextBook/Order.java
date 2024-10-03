package TextBook;

import java.text.NumberFormat;
import java.util.Scanner;

public class Order {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        //Vars and scanner
        final double BCOST = 1.69, FCOST = 1.09, CCOST = 0.99, TAX = 0.065;
        double totalCost, subTotal, taxAmount;
        int burgers, fries, cokes;

        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        //Input from usr for order
        System.out.print("\nHow many burgers would you like: ");
        burgers = input.nextInt();
        input.nextLine();

        System.out.print("How many fries would you like: ");
        fries = input.nextInt();
        input.nextLine();

        System.out.print("How many cokes would you like: ");
        cokes = input.nextInt();
        input.nextLine();

        // Calculation
        subTotal = (BCOST * burgers) + (FCOST * fries) + (CCOST * cokes);
        taxAmount = subTotal * TAX;
        totalCost = taxAmount + subTotal;

        // Output
        System.out.println("\nSubtotal: " + currency.format(subTotal));
        System.out.println("Tax: " + currency.format(taxAmount));
        System.out.println("Total: " + currency.format(totalCost));

        System.out.print("\n Enjoy the day. WI");
    }
}
