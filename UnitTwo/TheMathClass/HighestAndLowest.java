package UnitTwo.TheMathClass;

import java.util.Scanner;

public class HighestAndLowest {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        num2 = input.nextInt();

        // Calculate absolute values
        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);

        // Use absolute values for highest and lowest
        int highest = Math.max(absNum1, absNum2);
        int lowest = Math.min(absNum1, absNum2);

        System.out.println("The highest absolute number is: " + highest);
        System.out.println("The lowest absolute number is: " + lowest);

        input.close();
    }
}
