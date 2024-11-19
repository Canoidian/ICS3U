package UnitTwo.ForLoops;

import java.util.Scanner;

public class BlastOff {
    public static void main(String[] args) throws InterruptedException {
        int num;
        Scanner input = new Scanner(System.in);

        do {
        System.out.print("Please enter a integer less than 10: ");
        num = input.nextInt();
        input.nextLine();
        } while (num < 10);

        for (int i = num; i >= 0; i--) {
            System.out.print(i + ", ");
            Thread.sleep(1000);
        }
        System.out.println("\nBlast off!");
    }
}
