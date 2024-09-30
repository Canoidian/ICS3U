package UnitOne.D_IStatements;

// Imports
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        // Vars and scanner object
        int temp;
        Scanner input = new Scanner(System.in);


        // Explanation on what the program does
        System.out.println("\n\nThis program will take a temperature in celsius then will tell you what category it is in.");

        // Input for usr temperature
        System.out.print("\nEnter Temperature value in Degrees celsius: ");
        temp = input.nextInt();
        input.nextLine();

        if (temp < 0) {
            System.out.println("Freezing");
        }
        else if (temp == 0) {
            System.out.println("Water freezes");
        }
        else if (temp > 0 && temp <= 10) {
            System.out.println("Cool temperature");
        }
        else if (temp > 10 && temp <= 20) {
            System.out.println("Moderate temperature");
        }
        else if (temp > 20 && temp <= 40) {
            System.out.println("Hot");
        }
        else {
            System.out.println("Very Hot");
        }

        System.out.print("\n Enjoy the day. WI");
    }
}
