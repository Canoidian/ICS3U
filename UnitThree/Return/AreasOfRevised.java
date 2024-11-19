package UnitThree.Return;

import java.util.Scanner;
import java.util.Arrays;

public class AreasOfRevised {

    //!Menu
    public static void menu() {
        System.out.println("\n1. Circle\n2. Rectangle\n3. Triangle\n4. Square\n5. Exit");
    }

    //! Circle
    public static int aCircle(double radius) {
        int area;

        area = (int) (Math.PI * Math.pow(radius, 2));

        return area;
    }

    //! Rectangle
    public static int aRectangle(int length, int width) {
        int area;
        
        area = length * width;
        return area;
    }

    //! Triangle
    public static int aTriangle(int base, int height) {
        int area;

        area = (base * height) / 2;
        return area;
    }

    //! Square
    public static int aSquare(int length) {
        int area;

        area = length * length;
        return area;
    }

    //^Main Method
    public static void main(String[] args) {
        int choice, length, width, base, height, area;
        double radius;
        boolean again = true;
        String now;
        int[] options = {1,2,3,4,5};

        Scanner input = new Scanner(System.in);

        do {
            menu();
            do {
                System.out.print("Please enter your choice: ");
                choice = input .nextInt();
                input.nextLine();
            } while(!Arrays.asList(options).contains(choice)); // Check if choice is in options

            switch (choice) {
                case 1: //& Circle
                    System.out.println("\nCircle");

                    System.out.print("\nPlease enter the radius of your circle(mm): ");
                    radius = input.nextDouble();
                    input.nextLine();
                    area = aCircle(radius);
                    System.out.println("The area of your Circle is " + area);
                    break;
                case 2: //& Rectangle
                    System.out.println("\nRectangle");

                    System.out.print("\nPlease enter the length of your rectangle(mm): ");
                    length = input.nextInt();
                    input.nextLine();
                    System.out.print("Please enter the width of your rectangle(mm): ");
                    width = input.nextInt();
                    input.nextLine();

                    area = aRectangle(length, width);
                    System.out.println("The area of your Rectangle is " + area);
                    break;
                case 3: //& Triangle
                    System.out.println("\nTriangle");

                    System.out.print("\nPlease enter the base of your triangle(mm): ");
                    base = input.nextInt();
                    input.nextLine();
                    System.out.print("Please enter the height of your triangle(mm)");
                    height = input.nextInt();
                    input.nextLine();

                    area = aTriangle(base, height);
                    System.out.println("The area of your Triangle is " + area);
                    break;
                case 4: //& Square
                System.out.println("\nSquare");

                System.out.print("\nPlease enter the length of your square(mm): ");
                length = input.nextInt();
                input.nextLine();

                area = aSquare(length);
                System.out.println("The area of your Square is " + area);
                break;
                default: //? Exit
                    return;
            }

            do {
                System.out.print("\nWould you like to find another area of a shape (y/n): ");
                now = input.nextLine().toLowerCase();
            } while (!now.equals("y") && !now.equals("n"));

            again = now.equals("y");

            if (again = true) {
                radius = 0;
                length = 0;
                width = 0;
                base = 0;
                height = 0;
            }

        } while(again = true);
    }
}