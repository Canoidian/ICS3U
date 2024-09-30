package UnitOne.D_IStatements;

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        
        // Vars and random and scanner
        int usr=0, num;

        Random r = new Random();
        Scanner input = new Scanner(System.in);

        

        while (usr != 4) {

            num = 1 + r.nextInt(3);

            System.out.println("1 = Rock, 2 = Paper, 3 = Scissors, 4 = Quit");

            do {
                System.out.print("Please enter a value: ");
                usr = input.nextInt();
                input.nextLine();
            } while (usr < 1 || usr > 4);

            if (usr == 4) {
                System.out.println("Thanks for playing!");
                break;
            }

            String[] choices = {"Rock", "Paper", "Scissors"};
            System.out.println("You chose: " + choices[usr - 1]);
            System.out.println("Computer chose: " + choices[num - 1]);

            if (usr == num) {
                System.out.println("It's a tie!");
            } else if ((usr == 1 && num == 3) || (usr == 2 && num == 1) || (usr == 3 && num == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.println();
        }

        input.close();
    }
}
