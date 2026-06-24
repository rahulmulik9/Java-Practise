package Challenge75_DSA.June.Day24;


class SolSortColors {

    public static void sortColorsBrute(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if      (num == 0) count0++;
            else if (num == 1) count1++;
            else               count2++;
        }
        int i = 0;
        while (count0-- > 0) nums[i++] = 0;
        while (count1-- > 0) nums[i++] = 1;
        while (count2-- > 0) nums[i++] = 2;
    }

    public static void sortColorsOptimal(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low]; nums[low] = nums[mid]; nums[mid] = temp;
                low++; mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid]; nums[mid] = nums[high]; nums[high] = temp;
                high--;
            }
        }
    }
}

public class SortColors {
    public static void main(String[] args) {

        // Test 1: Mixed colors → [0,0,1,1,2,2]
        int[] t1a = {2,0,2,1,1,0}; SolSortColors.sortColorsBrute(t1a);
        System.out.println("Test 1 Brute  : " + (java.util.Arrays.equals(t1a, new int[]{0,0,1,1,2,2}) ? "PASS" : "FAIL"));
        int[] t1b = {2,0,2,1,1,0}; SolSortColors.sortColorsOptimal(t1b);
        System.out.println("Test 1 Optimal: " + (java.util.Arrays.equals(t1b, new int[]{0,0,1,1,2,2}) ? "PASS" : "FAIL"));

        // Test 2: Already sorted → unchanged [0,1,2]
        int[] t2a = {0,1,2}; SolSortColors.sortColorsBrute(t2a);
        System.out.println("Test 2 Brute  : " + (java.util.Arrays.equals(t2a, new int[]{0,1,2}) ? "PASS" : "FAIL"));
        int[] t2b = {0,1,2}; SolSortColors.sortColorsOptimal(t2b);
        System.out.println("Test 2 Optimal: " + (java.util.Arrays.equals(t2b, new int[]{0,1,2}) ? "PASS" : "FAIL"));

        // Test 3: All same → unchanged [1,1,1]
        int[] t3a = {1,1,1}; SolSortColors.sortColorsBrute(t3a);
        System.out.println("Test 3 Brute  : " + (java.util.Arrays.equals(t3a, new int[]{1,1,1}) ? "PASS" : "FAIL"));
        int[] t3b = {1,1,1}; SolSortColors.sortColorsOptimal(t3b);
        System.out.println("Test 3 Optimal: " + (java.util.Arrays.equals(t3b, new int[]{1,1,1}) ? "PASS" : "FAIL"));

        // Test 4: Reverse order → [0,1,2]
        int[] t4a = {2,1,0}; SolSortColors.sortColorsBrute(t4a);
        System.out.println("Test 4 Brute  : " + (java.util.Arrays.equals(t4a, new int[]{0,1,2}) ? "PASS" : "FAIL"));
        int[] t4b = {2,1,0}; SolSortColors.sortColorsOptimal(t4b);
        System.out.println("Test 4 Optimal: " + (java.util.Arrays.equals(t4b, new int[]{0,1,2}) ? "PASS" : "FAIL"));
    }
}