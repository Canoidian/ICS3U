package UnitTwo.NestedLoops;

public class XYProblem {
    public static void main(String[] args) {
        int ans;

        for (int x = 1; x <= 6; x++) {
            System.out.print("X: " + x); // Printing current x value

            for (int y = -4; y <= 8; y += 4) {
                System.out.print("\tY: " + y); // Printing current y value

                ans = (x * y) / 3*x + y; // Calculation

                System.out.println("\tAnswer: " + ans); // Prints current ans
            }
            System.out.println();
        }
    }
}
