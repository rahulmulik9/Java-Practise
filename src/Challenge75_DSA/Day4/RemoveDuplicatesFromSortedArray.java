package Challenge75_DSA.Day4;

import java.util.Arrays;
import java.util.LinkedHashSet;

class SolRemoveDuplicatesFromSortedArray {

    public static int removeDuplicatesBrute(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums) set.add(num);
        int i = 0;
        for (int num : set) nums[i++] = num;
        return set.size();
    }

    public static int removeDuplicatesOptimal(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        // Test 1: [1,1,2] → k=2, first 2 = [1,2]
        int[] t1b = {1,1,2}; int k1b = new SolRemoveDuplicatesFromSortedArray().removeDuplicatesBrute(t1b);
        int[] t1o = {1,1,2}; int k1o = new SolRemoveDuplicatesFromSortedArray().removeDuplicatesOptimal(t1o);
        System.out.println("Test 1 Brute  : " + (k1b == 2 && Arrays.equals(Arrays.copyOf(t1b, k1b), new int[]{1,2}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (k1o == 2 && Arrays.equals(Arrays.copyOf(t1o, k1o), new int[]{1,2}) ? "PASS" : "FAIL"));

        // Test 2: [0,0,1,1,1,2,2,3,3,4] → k=5, first 5 = [0,1,2,3,4]
        int[] t2b = {0,0,1,1,1,2,2,3,3,4}; int k2b = new SolRemoveDuplicatesFromSortedArray().removeDuplicatesBrute(t2b);
        int[] t2o = {0,0,1,1,1,2,2,3,3,4}; int k2o = new SolRemoveDuplicatesFromSortedArray().removeDuplicatesOptimal(t2o);
        System.out.println("Test 2 Brute  : " + (k2b == 5 && Arrays.equals(Arrays.copyOf(t2b, k2b), new int[]{0,1,2,3,4}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (k2o == 5 && Arrays.equals(Arrays.copyOf(t2o, k2o), new int[]{0,1,2,3,4}) ? "PASS" : "FAIL"));

        // Test 3: no duplicates [1,2,3] → k=3
        int[] t3b = {1,2,3}; int k3b = new SolRemoveDuplicatesFromSortedArray().removeDuplicatesBrute(t3b);
        int[] t3o = {1,2,3}; int k3o = new SolRemoveDuplicatesFromSortedArray().removeDuplicatesOptimal(t3o);
        System.out.println("Test 3 Brute  : " + (k3b == 3 && Arrays.equals(Arrays.copyOf(t3b, k3b), new int[]{1,2,3}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (k3o == 3 && Arrays.equals(Arrays.copyOf(t3o, k3o), new int[]{1,2,3}) ? "PASS" : "FAIL"));

        // Test 4: all same [2,2,2,2] → k=1, first 1 = [2]
        int[] t4b = {2,2,2,2}; int k4b = new SolRemoveDuplicatesFromSortedArray().removeDuplicatesBrute(t4b);
        int[] t4o = {2,2,2,2}; int k4o = new SolRemoveDuplicatesFromSortedArray().removeDuplicatesOptimal(t4o);
        System.out.println("Test 4 Brute  : " + (k4b == 1 && Arrays.equals(Arrays.copyOf(t4b, k4b), new int[]{2}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (k4o == 1 && Arrays.equals(Arrays.copyOf(t4o, k4o), new int[]{2}) ? "PASS" : "FAIL"));
    }
}