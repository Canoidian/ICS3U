package UnitThree.Return;

import java.util.Scanner;
import java.util.Random;

public class RanRevised {
    public static int random(int start, int end) {
        Random r = new Random();
        int number;

        number = start + r.nextInt(end - start + 1);
        return number;
    }

    public static void main(String[] args) {
        int start, end, number;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter the start value of the random number: ");
            start = input.nextInt();
            input.nextLine();

            System.out.print("Please enter the end value of the random number: ");
            end = input.nextInt();
            input.nextLine();

            if (start > end) {
                System.out.println("Error: Start value must be less than or equal to end value. Please try again.");
            }
        } while (start > end); // Repeat until valid input is provided

        number = random(start, end);
        System.out.print("Your random number is " + number);
    }
}
