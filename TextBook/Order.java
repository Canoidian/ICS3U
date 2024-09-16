package TextBook;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        
        // Vars and scanner
        final double BCOST = 1.69, FCOST = 1.09, CCOST = 0.99, TAX = 0.065;
        double totalCost, subTotal, taxAmount;
        int burgers, fries, cokes;

        Scanner input = new Scanner(System.in);

        //Input from usr for order
        System.out.print("How many burgers would you like: ");
        burgers = input.nextInt();
        input.nextLine();

        System.out.print("How many fries would you like: ");
        fries = input.nextInt();
        input.nextLine();

        System.out.print("How many cokes would you like: ");
        cokes = input.nextInt();
        input.nextLine();

        // Caculation
        subTotal = (BCOST * burgers) + (FCOST * fries) + (CCOST * cokes);
        taxAmount = subTotal * TAX;
        totalCost = taxAmount + subTotal;

        // Out




    }
}
