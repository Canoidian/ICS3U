package UnitTwo.Boolean;

import java.util.Scanner;

public class PasswordCheck {
@SuppressWarnings("resource")

    public static void main(String[] args) {
        
        String password = "Kevin sucks at programming", guess;
        int counter = 2;
        boolean correct = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the password you have 3 guesses: ");
            guess = input.nextLine();

        while (!guess.equals(password) && counter > 0) {
            System.out.print("Please enter the password you have " + counter + " guesses left: ");
            guess = input.nextLine();

            counter--;

            if (guess.equals(password)) {
                correct = true;
                break;
            }
        }

        if (correct) {
            System.out.println("Correct. You are in.");
        } else {
            System.out.println("LOCKED OUT!!!");
        }
        
    }
}