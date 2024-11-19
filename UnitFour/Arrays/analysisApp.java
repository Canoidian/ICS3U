package UnitFour.Arrays;

import java.util.Scanner;

public class analysisApp {
    public static int mean(int[] nums, int MAX) {
        int sum = 0, mean;

        for (int i = 0; i < MAX; i++) {
            sum += nums[i];
        }
        mean = sum / MAX;

        return (int) mean;
    }

    public static int highest(int[] nums, int MAX) {
        int highest = nums[0];

        for (int i = 1; i < MAX; i++) {
            if (nums[i] > highest) {
                highest = nums[i];
            }
        }

        return highest;
    }

    public static int range(int[] nums, int MAX) {
        int range = 0;
        int highest = highest(nums, MAX);
        int lowest = nums[0];

        for (int i = 1; i < MAX; i++) {
            if (nums[i] < lowest) {
                lowest = nums[i];
            }
        }

        range = highest - lowest;

        return range;
    }

    public static void populateArray(int[] nums, int MAX) {
        for (int i = 0; i < MAX; i++) {
            nums[i] = Other.generateRandomNumber(0, 100);
        }
    }

    public static void displayArray(int[] nums, int MAX) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static int mode(int[] nums, int[] occ) {
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

        return mode;
    }

    public static void main(String[] args) throws InterruptedException {
        final int MAX = 10;
        int mean, highest, range, choice, mode;
        int[] nums = new int[MAX];
        int[] countArray = new int[100];

        boolean again = true;
        Scanner input = new Scanner(System.in);

        populateArray(nums, MAX);

        while (again) {
            System.out.print("\n1. Print Array of Numbers\n2. Mean\n3. Highest\n4. Range\n5. Mode\n6. Exit");
            choice = Input.intValid("\n\nEnter your choice: ", 1, 5);

            switch (choice) {
                case 1:
                    displayArray(nums, MAX);
                    break;
                case 2: //! mean
                    mean = mean(nums, MAX);
                    System.out.println("Mean: " + mean);
                    break;
                case 3: //! highest
                    highest = highest(nums, MAX);
                    System.out.println("Highest: " + highest);
                    break;
                case 4: //! range
                    range = range(nums, MAX);
                    System.out.println("Range: " + range);
                    break;
                case 5: //! Mode
                    mode = mode(nums, countArray);
                    System.out.println("Mode: " + mode);
                case 6:
                    System.out.println("Exiting...");
                    Thread.sleep(500);
                    again = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
