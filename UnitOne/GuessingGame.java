package UnitOne;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        
        //Vars and scanner
        int theNum = 10, guess = 0, counter = 1;

        Scanner input = new Scanner(System.in);

        // Explanation of program
        System.out.println("\nThis program is a guessing there is a preset answer and you need to guess until you get the right answer");
        System.out.println("I am going to start you off with a little hint: The number is between 1-20");

        // Get first guess
        System.out.print("\nGuess number " + counter + ": ");
        guess = input.nextInt(); input.nextLine();

        while (guess != theNum) {

            // update counter
            counter++;

            // Get users guess
            System.out.print("Please enter guess number " + counter + ": ");
            guess = input.nextInt(); input.nextLine();
        }

        System.out.println("\n\nYou got it!!! Yes the answer is " + theNum + "!");
        System.out.print("\n Enjoy the day. WI");
    }
}