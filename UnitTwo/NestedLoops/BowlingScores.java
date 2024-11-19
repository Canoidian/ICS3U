package UnitTwo.NestedLoops;

import java.util.Scanner;

public class BowlingScores {
    public static void main(String[] args) {
        String name;
        int total = 0, score;
        boolean again = true;
        double average;

        Scanner input = new Scanner(System.in);

        while (again) { // Repeat program if again is true

            // Get name
            System.out.print("Please enter your name: ");
            name = input.nextLine();
            // Remove this line: input.nextLine();

            total = 0; // Reset total for each player

            // get players scores for 6 games
            for (int i = 1; i <= 6; i++) {
                System.out.print("Please enter your score for game " + i + ": ");
                score = input.nextInt();
                input.nextLine(); // Consume the newline character

                total += score;
            }

            average = total / 6; // Calculate average outside the loop
            System.out.println(name + "'s average score is: " + average);

            System.out.print("Would you like to enter another player? (y/n) ");
            again = input.nextLine().equalsIgnoreCase("y"); // Asks usr if they would like to play again
        }
    }
}