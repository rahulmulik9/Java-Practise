package Challenge75_new.Day18;

import java.util.HashMap;

class SolContiguousArray {

    public static int findMaxLengthBrute(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) zeros++; else ones++;
                if (zeros == ones) maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }

    public static int findMaxLengthOptimal(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 1) ? 1 : -1;
            if (map.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}

public class ContiguousArray {
    public static void main(String[] args) {

        // Test 1: [0,1,0,1,1,0] → equal 0s and 1s across full array = 6
        int[] t1 = {0, 1, 0, 1, 1, 0};
        System.out.println("Test 1 Brute  : " + (new SolContiguousArray().findMaxLengthBrute(t1)   == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolContiguousArray().findMaxLengthOptimal(t1) == 6 ? "PASS" : "FAIL"));

        // Test 2: [0,1] → simple equal pair = 2
        int[] t2 = {0, 1};
        System.out.println("Test 2 Brute  : " + (new SolContiguousArray().findMaxLengthBrute(t2)   == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolContiguousArray().findMaxLengthOptimal(t2) == 2 ? "PASS" : "FAIL"));

        // Test 3: [0,0,0,1,1,1] → entire array = 6
        int[] t3 = {0, 0, 0, 1, 1, 1};
        System.out.println("Test 3 Brute  : " + (new SolContiguousArray().findMaxLengthBrute(t3)   == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolContiguousArray().findMaxLengthOptimal(t3) == 6 ? "PASS" : "FAIL"));

        // Test 4: [0,0,1,0,0,0,1,1] → longest = 6 ([0,1,0,0,0,1] or [1,0,0,0,1,1])
        int[] t4 = {0, 0, 1, 0, 0, 0, 1, 1};
        System.out.println("Test 4 Brute  : " + (new SolContiguousArray().findMaxLengthBrute(t4)   == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolContiguousArray().findMaxLengthOptimal(t4) == 6 ? "PASS" : "FAIL"));
    }
}