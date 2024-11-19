package UnitThree.Return;

import java.util.Random;
import java.util.Scanner;

public class HiLow {

    public static int random() {
        Random r = new Random();
        int ran;

        ran = 0 + r.nextInt(13 - 0 + 1);
        return ran;
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        // Initialize game variables
        int score = 1000, risk, ran, predict;
        boolean again = true;

        Scanner input = new Scanner(System.in);

        do {
            // Game introduction and rules
            System.out.println("High Low Game");
            System.out.println("\nRULES" + "\nNumbers 1 through 6 are low" + "\nNumbers 8 through 13 are high" + "\nNumber 7 is neither high or low");
            System.out.println("\n\nYou have " + score + " points.");

            // Get user input for risk
            System.out.print("\nEnter points to risk (max " + score + "): ");
            do {
                risk = input.nextInt();
                input.nextLine();
            } while (risk < 0 || risk > score); // Ensure risk is within valid range

            // Get user prediction
            System.out.print("Predict <0=Low, 1=High>: ");
            predict = input.nextInt();
            input.nextLine(); // Consume the newline character
            ran = random(); // Generate random number
            System.out.println("Number is " + ran);

            // Check prediction against random number
            if ((ran <= 6 && predict == 0) || (ran >= 8 && predict == 1)) {
                System.out.println("You win.");
                score += (risk * 2); // Double the risk amount if the prediction is correct
            } else {
                System.out.println("You lose.");
                score -= risk; // Deduct risk amount if the prediction is incorrect
            }

            // Prompt user to play again
            System.out.print("Play again(y/n): ");
            String userInput;
            do {
                userInput = input.nextLine().toLowerCase();
                if (userInput.equals("n")) {
                    again = false; // Exit game if user chooses 'n'
                } else if (!userInput.equals("y")) {
                    System.out.print("Invalid input. Please enter 'y' or 'n': ");
                }
            } while (!userInput.equals("y") && !userInput.equals("n"));

            // New condition to reset if score is 0
            if (score == 0) {
                System.out.println("You have 0 points. Starting over...");
                score = 1000; // Reset score
                clear();
            } else {
                clear(); // Clear screen for next round
            }

        } while (again); // Continue game loop if user wants to play again
    }
    
}