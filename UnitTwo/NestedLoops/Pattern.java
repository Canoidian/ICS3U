package UnitTwo.NestedLoops;

public class Pattern {
    public static void main(String[] args) {
        

        for (int row = 1; row <= 15; row++) { // Going one at a time through numbers 1 to 15
            for (int star = 1; star<=row; star++) { // Adding one star for each row
                System.out.print("*");
            }
            System.out.println(); // New line
        }

        System.out.println("\n");

        for (int row = 1; row <= 10; row++) {
            for (int num = 1; num<=row; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
        
        // Number of iterations for alternating triangles
        int iterations = 5;

        for (int i = 1; i <= iterations; i++) {
            if (i % 2 != 0) {
                // Print right-aligned triangle
                printRightAlignedTriangle(5); // You can adjust the height as needed
            } else {
                // Print left-aligned triangle
                printLeftAlignedTriangle(5); // You need to create this method
            }
        }
    }

    public static void printRightAlignedTriangle(int height) {
        for (int row = 1; row <= height; row++) {
            // Print spaces for right alignment
            for (int space = height - row; space > 0; space--) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(); // New line
        }
    }

    // New method to print a left-aligned triangle
    public static void printLeftAlignedTriangle(int height) {
        for (int row = 1; row <= height; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(); // New line
        }
    }
}
