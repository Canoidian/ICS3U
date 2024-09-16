// Page 99 - Exercise 1
package TextBook;

import java.util.Scanner;

public class ObjectHeight {
    public static void main(String[] args) {


        //Vars
        double time, h;
        Scanner input = new Scanner(System.in);

        // User input then give value to time
        System.out.print("Enter a time less than 4.5 seconds: ");
        time = input.nextDouble();

        // Equation
        h = 100 - 4.9 * Math.pow(time, 2);

        System.out.print("The height of the object is: " + h);
    }
}
