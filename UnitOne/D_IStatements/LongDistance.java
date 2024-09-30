package UnitOne.D_IStatements;

import java.util.Scanner;
import java.text.NumberFormat;

public class LongDistance {
    public static void main(String[] args) {
        
        int time;
        double total;
        try (Scanner input = new Scanner(System.in)) {
            NumberFormat currency = NumberFormat.getCurrencyInstance();

            // Description

            // Usr input
            System.out.print("\nPlease enter the length of the call in minutes: ");
            time = input.nextInt();
            input.nextLine();

            if (time < 2) {
                // Calculations to find price of call
                total = time * 0.75;

                System.out.println("Your total is: " + currency.format(total));
            }
            else {
                total = time * 0.35;
                System.out.println("Your total is: " + currency.format(total));
            }
        }
        System.out.print("\n Enjoy the day. WI");
    }
}
