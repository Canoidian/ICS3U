package UnitTwo.TheMathClass;

import java.util.Scanner;

public class RootsOfQudratic {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter value for a: ");
        a = input.nextDouble();
        input.nextLine();

        System.out.print("Please enter value for b: ");
        b = input.nextDouble();
        input.nextLine();
        
        System.out.print("Please enter value for c: ");
        c = input.nextDouble();
        input.nextLine();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if the discriminant is negative
        if (discriminant < 0) {
            System.out.println("There are no real roots for this quadratic function.");
        } else {
            // Calculate the roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Display the results
            System.out.println("The roots of the quadratic equation are:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }

        input.close(); // Close the Scanner
    }
}
