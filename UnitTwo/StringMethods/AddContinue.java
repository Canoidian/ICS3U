package UnitTwo.StringMethods;

import java.util.Scanner;

public class AddContinue {
    public static void main(String[] args) throws InterruptedException {
        
        boolean again = true;
        int sum=0;
        String ans;

        Scanner input = new Scanner(System.in);

        while (again == true) {
            System.out.print("Please enter a number to be added to the sum: ");
            sum += input.nextInt();
            input.nextLine();

            System.out.println("\n\nThe sum is currently: " + sum);

            do {
                System.out.print("\nWould you like to add another number (y/n): ");
                ans = input.nextLine().trim().toLowerCase();
            } while (ans.isEmpty() || (ans.charAt(0) != 'y' && ans.charAt(0) != 'n'));

            again = (ans.charAt(0) == 'y');

            Thread.sleep(500);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        System.out.println("\n\nThe sum is currently: " + sum);
    }
}
