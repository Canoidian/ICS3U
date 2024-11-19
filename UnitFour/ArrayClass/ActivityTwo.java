package UnitFour.ArrayClass;

import java.util.Arrays;
import java.util.Scanner;

public class ActivityTwo {
    public static void main(String[] args) {
        String[] name = new String[10], unsortedName;
        Scanner input = new Scanner(System.in);

        Arrays.fill(name, 0);

        System.out.println(Arrays.toString(name));

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            name[i] = input.nextLine();
        }

        unsortedName = Arrays.copyOf(name, 10);

        Arrays.sort(unsortedName);

        System.out.println(Arrays.toString(unsortedName));
        System.out.println(Arrays.toString(name));
        

    }
}
