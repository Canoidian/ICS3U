package UnitThree.MethodOverloading;

import java.util.Scanner;

public class inputImprovement {

    public static int getInt(String prompt, int min, int max) {
        int number;
        Scanner input = new Scanner(System.in);

        do {
        System.out.print(prompt);
        number = input.nextInt();
        input.nextLine();
        } while (number < min || number > max);

        return number;
    }

    public static int getInt(String prompt, int max) {
        int number;
        Scanner input = new Scanner(System.in);

        do {
        System.out.print(prompt);
        number = input.nextInt();
        input.nextLine();
        } while (number > max);

        return number;
    }

    public static String getInt(String prompt) {
        String number;
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);
        number = input.nextLine();
        return number;
    }

    public static int getInt() {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();
        return number;
    }


    public static void main(String[] args) {
        int number;

        number = getInt("Please enter your ICS3U mark: ", 0, 100);

        System.out.println("Your number is " + number);
    }
}
