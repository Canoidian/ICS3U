package UnitTwo.Void;

import java.util.Scanner;

public class StarPyrimid {
    public static void main(String[] args) {
        displayMenu(); // Call the menu display method
    }

    // Method to display the menu
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a pyramid pattern:");
        System.out.println("1. Left-aligned pyramid");
        System.out.println("2. Right-aligned pyramid");
        System.out.println("3. Symmetrical pyramid");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = scanner.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        switch (choice) {
            case 1:
                leftAlignedPyramid(rows); // Call left-aligned pyramid method
                break;
            case 2:
                rightAlignedPyramid(rows); // Call right-aligned pyramid method
                break;
            case 3:
                symmetricalPyramid(rows); // Call symmetrical pyramid method
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
        scanner.close();
    }

    // Method to display a left-aligned pyramid
    public static void leftAlignedPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to display a right-aligned pyramid
    public static void rightAlignedPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to display a symmetrical pyramid
    public static void symmetricalPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
