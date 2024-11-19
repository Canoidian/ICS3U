package UnitFour.ArrayClass;

import java.util.Arrays;

public class Activity1 {
    public static void main(String[] args) {
        int pos;
        int[] range;
        int[] num = new int[100]; // 1

        Arrays.fill(num, 1); // 2

        //System.out.println(Arrays.toString(num)); // 3

        for (int i = 0; i < 100; i++) {
            num[i] = Other.generateRandomNumber(0, 100); // 4
        }

        Arrays.sort(num); // 5

        //System.out.println(Arrays.toString(num)); // 6

        pos = Arrays.binarySearch(num, 5); // 7
        System.out.println(pos);

        if (pos >= 0) {
            range = Arrays.copyOfRange(num, pos - 1, pos + 2);
            System.out.println(Arrays.toString(range));
        }
        else{
            System.out.println("na");
        }
    }
}
