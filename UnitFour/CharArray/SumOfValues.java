package UnitFour.CharArray;

import java.util.Arrays;

public class SumOfValues {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        String nums;

        for (int i = 0; i <= 10; i++) {
            numbers[i] = Other.generateRandomNumber(0, 10); // Populate array
        }

        nums = Arrays.toString(numbers); // convert array to string

        


    }
}
