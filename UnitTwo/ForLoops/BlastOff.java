package UnitTwo.ForLoops;

import java.util.Scanner;

public class BlastOff {
    public static void main(String[] args) throws InterruptedException {
        int usr;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a integer less than 10: ");
        usr = input.nextInt();
        input.nextLine();

        for (int i = usr; i >= 0; i--) {
            System.out.print(i + ", ");
            Thread.sleep(1000);
        }
        System.out.println("\nBlast off!");
    }
}
