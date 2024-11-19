package UnitTwo.Boolean;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        int num = 0;
        boolean prime = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num = input.nextInt();
        input.nextLine();

        // Checks to see if it is prime
        if (num <= 1) {
            prime = false;
        } else {
            prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println("Your number is a prime number");
        } else {
            System.out.println("Your number is not a prime number");
        }
    }
}
