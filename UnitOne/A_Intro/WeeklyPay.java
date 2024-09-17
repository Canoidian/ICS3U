
package UnitOne.A_Intro;

import java.text.NumberFormat;
import java.util.Scanner;

public class WeeklyPay {
    public static void main(String[] args) {

        //* Vars
        double hourlyWage;
        int hoursWorked;
        String name;

        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // Paid per hour
        System.out.print("How much do you make per hour: ");
        hourlyWage = input.nextDouble(); //Get input value
        input.nextLine(); //Flush

        // Name
        System.out.print("What is your name: ");
        name = input.nextLine(); //Get input value
        input.nextLine(); //Flush

        // Hours worked
        System.out.print("How many hours do you work per week: ");
        hoursWorked = input.nextInt();
        input.nextLine();

        // Print
        System.out.println("Hello " + name);
        System.out.println("This week you worked "+ hoursWorked);
        System.out.println("You said you get paid $" + hourlyWage + " per hour");
    }
}
