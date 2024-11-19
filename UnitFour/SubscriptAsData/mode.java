package UnitFour.SubscriptAsData;

import java.util.Arrays;

public class mode {

    public static void populateArray(int[] nums) {
        for (int i = 0; i < 100; i++) {
            nums[i] = Other.generateRandomNumber(0, 99);
        }
    }

    public static void calMode(int[] nums, int[] occ) {
        for (int i = 0; i < nums.length; i++) {
            occ[nums[i]]++;
        }

        int mode = 0;
        int maxCount = 0;

        for (int j = 0; j < occ.length; j++) {
            if (occ[j] > maxCount) {
                maxCount = occ[j];
                mode = j;
            }
        }

        System.out.println("Mode: " + mode);
    }

    public static void main(String[] args) {
        int[] nums = new int[100];
        int[] occ = new int[100];

        populateArray(nums);
        calMode(nums, occ);

        Other.clear();
        System.out.println(Arrays.toString(occ));
        System.out.println(Arrays.toString(nums));
    }
}
