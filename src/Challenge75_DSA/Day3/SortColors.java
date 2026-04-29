package Challenge75_DSA.Day3;

import java.util.Arrays;

class SolSortColors {

    // Brute Force: Count 0s, 1s, 2s
    public static void sortColorsBrute(int[] nums) {
        int zeros = 0, ones = 0, twos = 0;

        for (int num : nums) {
            if (num == 0) zeros++;
            else if (num == 1) ones++;
            else twos++;
        }

        int i = 0;

        while (zeros-- > 0) nums[i++] = 0;
        while (ones-- > 0) nums[i++] = 1;
        while (twos-- > 0) nums[i++] = 2;
    }

    // Optimal: Dutch National Flag Algorithm
    public static void sortColorsOptimal(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

public class SortColors {
    public static void main(String[] args) {

        // Test 1
        int[] t1b = {2,0,2,1,1,0};
        SolSortColors.sortColorsBrute(t1b);

        int[] t1o = {2,0,2,1,1,0};
        SolSortColors.sortColorsOptimal(t1o);

        System.out.println("Test 1 Brute  : " + (Arrays.equals(t1b, new int[]{0,0,1,1,2,2}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (Arrays.equals(t1o, new int[]{0,0,1,1,2,2}) ? "PASS" : "FAIL"));

        // Test 2
        int[] t2b = {2,0,1};
        SolSortColors.sortColorsBrute(t2b);

        int[] t2o = {2,0,1};
        SolSortColors.sortColorsOptimal(t2o);

        System.out.println("Test 2 Brute  : " + (Arrays.equals(t2b, new int[]{0,1,2}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (Arrays.equals(t2o, new int[]{0,1,2}) ? "PASS" : "FAIL"));

        // Test 3
        int[] t3b = {0,1,2};
        SolSortColors.sortColorsBrute(t3b);

        int[] t3o = {0,1,2};
        SolSortColors.sortColorsOptimal(t3o);

        System.out.println("Test 3 Brute  : " + (Arrays.equals(t3b, new int[]{0,1,2}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (Arrays.equals(t3o, new int[]{0,1,2}) ? "PASS" : "FAIL"));

        // Test 4
        int[] t4b = {1,1,1};
        SolSortColors.sortColorsBrute(t4b);

        int[] t4o = {1,1,1};
        SolSortColors.sortColorsOptimal(t4o);

        System.out.println("Test 4 Brute  : " + (Arrays.equals(t4b, new int[]{1,1,1}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (Arrays.equals(t4o, new int[]{1,1,1}) ? "PASS" : "FAIL"));
    }
}