// Page 100 - Exercise 6
package TextBook;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        
        // Variables and scanner
        int change, quarters, dimes, nickles, pennies;
        

        Scanner input = new Scanner(System.in);

        // Amount of cents input value
        System.out.print("Enter the change in cents: ");
        change = input.nextInt();

        //^ Cacluations

        /*
        //* Quarters
        amountOfQuarters = change / QUARTERS;
        change %= QUARTERS;
        //* Dimes
        amountOfDimes = change / DIMES ;
        change %= DIMES;
        //* Nickels
        amountOfNickels = change / NICKLES;
        change %= NICKLES;
        //* Pennies
        amountOfPennies = change / PENNIES;
        change %= PENNIES;*/

        quarters = change / 25;
        dimes = (change % 25) / 10;
        nickles = (change % 25) / 5;
        pennies = (change % 25) % 5;

        // Output values
        System.out.println("The minimum number of coins is: ");

        System.out.println("\tQuarters: " + quarters);
        System.out.println("\tDimes: " + dimes);
        System.out.println("\tNickels: " + nickles);
        System.out.println("\tPennies: " + pennies);
    }
}
