package UnitTwo.CaseConstruct;

import java.util.Scanner;
import java.text.NumberFormat;

public class BurgerJoint {

    //! Menu class
    public static void Menu() {
        double burgerPrice = 10.50, friesPrice = 7.85, popPrice = 12.20, comboPrice = 35.99;

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("Menu:\n1 Burger: " + currency.format(burgerPrice) + "\n2 Fries: " + currency.format(friesPrice) +
        "\n3 Pop: " + currency.format(popPrice) + "\n4 Combo: " + currency.format(comboPrice));
    }


    public static void main(String[] args) throws InterruptedException{
        
        // Vars
        final double TAX = 0.13;
        double burgerPrice = 10.50, friesPrice = 7.85, popPrice = 12.20, comboPrice = 35.99, taxAmount;
        double subtotal = 0, total;
        int burger, fries, pop, combo, item, burgerCount = 0, friesCount = 0, popCount = 0, comboCount = 0;
        boolean again = true;
        String ans;

        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("\n\n\nWelcome to the Willy William's Restaurant");
        System.out.println("=========================================");
        Thread.sleep(1500);

        // Menu
        Menu();
        System.out.print("\n\nPlease enter a number from 1 to 4 to select your first item: ");
        do {
            item = input.nextInt();
        } while (item < 1 || item > 4);
        input.nextLine();

        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Sees how many of a certain item the usr wants
        while (again) {
            switch (item) {
                case 1:
                    System.out.print("How many burgers would you like to order? ");
                    burger = input.nextInt();
                    subtotal += burger * burgerPrice; // Removed (int) cast
                    burgerCount += burger;
                    break;
                case 2:
                    System.out.print("How many fries would you like to order? ");
                    fries = input.nextInt();
                    subtotal += fries * friesPrice; // Removed (int) cast
                    friesCount += fries;
                    break;
                case 3:
                    System.out.print("How many pops would you like to order? ");
                    pop = input.nextInt();
                    subtotal += pop * popPrice; // Removed (int) cast
                    popCount += pop;
                    break;
                case 4:
                    System.out.print("How many combos would you like to order? ");
                    combo = input.nextInt();
                    subtotal += combo * comboPrice; // Removed (int) cast
                    comboCount += combo;
                    break;
                default:
                    // No need to reset subtotal here
                    break;
            }

            input.nextLine(); // Clear the input buffer

            do {
                System.out.print("Would you like to enter another item (y/n): ");
                ans = input.nextLine().toLowerCase();
            } while (!ans.equals("y") && !ans.equals("n"));

            again = ans.equals("y");

            if (again) {
                Thread.sleep(500);
                System.out.print("\033[H\033[2J");
                System.out.flush();

                Menu();

                do {
                    System.out.print("\n\nPlease enter a number from 1 to 4 to select your next item: ");
                    item = input.nextInt();
                } while (item < 1 || item > 4);
                input.nextLine(); // Clear the input buffer
            }
        }

        // Calculate the total
        taxAmount = subtotal * TAX;
        total = subtotal + taxAmount; // Changed to double for more precise calculation

        Thread.sleep(500);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Print the receipt
        System.out.println("\n\n========== Willy William's Restaurant ==========");
        System.out.println("                   Receipt                   ");
        System.out.println("=============================================");
        if (burgerCount > 0) {
            System.out.println("Burgers: " + burgerCount + " x " + currency.format(burgerPrice) + " = " + currency.format(burgerCount * burgerPrice));
        }
        if (friesCount > 0) {
            System.out.println("Fries: " + friesCount + " x " + currency.format(friesPrice) + " = " + currency.format(friesCount * friesPrice));
        }
        if (popCount > 0) {
            System.out.println("Pops: " + popCount + " x " + currency.format(popPrice) + " = " + currency.format(popCount * popPrice));
        }
        if (comboCount > 0) {
            System.out.println("Combos: " + comboCount + " x " + currency.format(comboPrice) + " = " + currency.format(comboCount * comboPrice));
        }
        System.out.println("---------------------------------------------");
        System.out.println("Subtotal:     " + currency.format(subtotal));
        System.out.println("Tax (13%):    " + currency.format(taxAmount));
        System.out.println("---------------------------------------------");
        System.out.println("Total:        " + currency.format(total));
        System.out.println("=============================================");
        System.out.println("Thank you for dining at Willy William's!");
        System.out.println("Please come again!");
    }
}