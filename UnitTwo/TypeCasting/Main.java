package UnitTwo.TypeCasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Num Store
        String inNum;
        char letter = ' ';
        int ascii = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please provided a number: ");
        inNum = input.next();

        letter = inNum.charAt(0);
        ascii = (int) letter;
        System.out.print(letter);


        // Double round
        double num = 7.324; // Example for usr imputed value
        int round;

        round = (int) num;

        System.out.print(round);

        //
    }
}