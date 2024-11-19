package UnitTwo.Boolean;

public class TheHundredGame {
    public static void main(String[] args) throws InterruptedException {
        boolean turn = true; //true = player 1, false = player 2
        int total1 = 0, total2 = 0;

        // While the total is below 100 continue
        while (total1 < 100 && total2 < 100) {

            // Player 1's turn
            if (turn) {
                System.out.println("\nPlayer 1's turn");
                Thread.sleep(1000); // Wait 1s

                int roll = (int)(Math.random() * 10) + 1; // Generate number between 1 and 10
                total1 += roll * 2; // Multiply by 2 to get even number between 2 and 20

                System.out.println("Rolled: " + (roll * 2));
                System.out.println("Total: " + total1);
                turn = false;
            }

            // Player 2's turn
            else {
                System.out.println("\nPlayer 2's turn");
                Thread.sleep(1000); // Wait 1s

                int roll = (int)(Math.random() * 11) + 1; // Generate number between 1 and 11
                total2 += roll * 2 - 1; // Multiply by 2 and subtract 1 to get odd number between 1 and 21

                System.out.println("Rolled: " + (roll * 2 - 1));
                System.out.println("Total: " + total2);
                turn = true;
            }
        }

        // Checks who wins
        if (total1 >= 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
