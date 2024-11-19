package UnitThree.ClassMethods;

import java.util.Scanner;
import java.util.Random;

public class Ran {
    public static void random(int start, int end) {
        Random r = new Random();
        int number;

        number = start + r.nextInt(end - start + 1);
        System.out.println("Your random number is "+ number);
    }

    public static void main(String[] args) {
        int start, end;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the start value of the random number:");
        start = input.nextInt();
        input.nextLine();

        System.out.print("Please enter the end value of the random number: ");
        end = input.nextInt();
        input.nextLine();

        random(start, end);
    }
}
