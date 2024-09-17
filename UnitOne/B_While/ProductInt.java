package UnitOne.B_While;

// Imports
import java.util.Scanner;

public class ProductInt {
    public static void main(String[] args) {
        
        // Inputs and Scanner object
        int value, total=1, counter = 1;

        Scanner input = new Scanner(System.in);

        // Explanation of program to user
        System.out.println("\n\nThis program allows you to input integers until the total product equals 1000");

        //First input
        System.out.print("\nPlease enter your 1 integer: ");
        value = input.nextInt();
        input.nextLine();

        while (total <= 1000) {
            // Add one to the counter
            counter++;

            // Multiply value from user to the total
            total *= value;

            System.out.print("Please enter your " + counter + " integer: ");
            value = input.nextInt();
            input.nextLine();

            // Multiply value from user to the total
            total *= value;
        }

        System.out.print("\n You inputed " + counter + " values that had a product of 1000");

        System.out.print("\n Enjoy the day. WI");
    }
}
