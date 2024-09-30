// Page 102 - Exercise 14

package TextBook;

import java.util.Scanner;

public class GallonConverter {
    public static void main(String[] args) {
        // Vars and Scanner
        int gallon, quarts, pints, cups, tablespoons;
        final int GALLON_TO_QUARTS = 4, QUART_TO_PINTS = 2, PINTS_TO_CUPS = 2, CUP_TO_TBLSPOONS = 16;

        Scanner input = new Scanner(System.in);


        // Program explanation
        System.out.println("\n\nThis program will covert a certain amount of gallons to quarts, pints, cups, and tablespoons.");

        // User gallon input
        System.out.print("\nEnter the number of gallons: ");
        gallon = input.nextInt();
        input.nextLine();

        // Convert
        quarts = gallon * GALLON_TO_QUARTS;
        pints = quarts * QUART_TO_PINTS;
        cups = pints * PINTS_TO_CUPS;
        tablespoons = cups * CUP_TO_TBLSPOONS;

        // Output
        System.out.println("In " + gallon + " there are:");
        System.out.println(quarts + " quarts"); System.out.println(pints + " pints"); System.out.println(cups + " cups"); System.out.println(tablespoons + " tablespoons");

    }
}