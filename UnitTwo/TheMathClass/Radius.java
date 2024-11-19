package UnitTwo.TheMathClass;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        int radius = 0, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Please input a radius: ");
        radius = input.nextInt();

        area = (int) (Math.PI * Math.pow(radius, 2));
        System.out.println("The area of the circle is: " + area);
    }
}
