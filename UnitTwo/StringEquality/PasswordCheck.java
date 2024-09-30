import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        
        String password = "I give up", guess;
        int counter = 2;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the password you have 3 guesses: ");
            guess = input.nextLine();

        while (!guess.equals(password) && counter > 0) {
            System.out.print("Please enter the password you have " + counter + " guesses left: ");
            guess = input.nextLine();

            counter--;
        }

        if (guess.equals(password)) {
            System.out.println("Correct. You are in.");
        } else {
            System.out.println("LOCKED OUT!!!");
        }
        
    }
}
