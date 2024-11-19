package UnitTwo.Conditions;

import java.util.Scanner;

public class CarRecall {
    public static void main(String[] args) {
        int modelNum, year;

        Scanner input = new Scanner(System.in);

        // Get model number
        System.out.print("Please enter the car's model number: ");
        modelNum = input.nextInt(); // Add to var
        input.nextLine(); // Flush

        System.out.print("Please enter the car's year: ");
        year = input.nextInt();
        input.nextLine();

        if ((year > 2004 && year < 2008) && (modelNum == 119 || modelNum == 121 || modelNum == 130 || modelNum == 145)) { // Checks to see year range and model num. If all is true car must bee recalled
            System.out.println("Your car is subject to recall.");
        } else if ((year > 2011 && year < 2014) && (modelNum == 201 || modelNum == 222 || modelNum == 256 || modelNum == 301)){
            System.out.println("Your car is subject to recall.");
        } else {
            System.out.println("Your car is not subject to recall."); // If no requirements are met then car is fine
        }
    }
}
