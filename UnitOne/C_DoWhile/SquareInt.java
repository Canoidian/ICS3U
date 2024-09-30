package UnitOne.C_DoWhile;

public class SquareInt {
    public static void main(String[] args) {
        int startInt = 5, total = 0;

        do {
            // Caculations, Putting startInt to the power of 2 then adding 5 to the start int for the next round
            total = (int) Math.pow(startInt, 2);
            startInt += 5;
            
            // Print values to the screen
            System.out.println(total);
        } while (total < 5000); // As long as the total is below 5000 the program will continue to run
    }
}
