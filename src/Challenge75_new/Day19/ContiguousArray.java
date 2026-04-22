package Challenge75_new.Day19;


import java.util.*;

class SolContiguousArray {
    public static int findMaxLengthBrute(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                count += (nums[j] == 0) ? -1 : 1;
                if (count == 0) maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }

    public static int findMaxLengthOptimal(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 0) ? -1 : 1;
            if (map.containsKey(count)) maxLen = Math.max(maxLen, i - map.get(count));
            else map.put(count, i);
        }
        return maxLen;
    }
}

public class ContiguousArray {
    public static void main(String[] args) {
        SolContiguousArray sol = new SolContiguousArray();

        // Test 1: [0,1] → 2
        System.out.println("Test 1 Brute  : " + (sol.findMaxLengthBrute(new int[]{0,1})             == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (sol.findMaxLengthOptimal(new int[]{0,1})           == 2 ? "PASS" : "FAIL"));

        // Test 2: [0,1,0,1,1,0] → 6
        System.out.println("Test 2 Brute  : " + (sol.findMaxLengthBrute(new int[]{0,1,0,1,1,0})    == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (sol.findMaxLengthOptimal(new int[]{0,1,0,1,1,0})  == 6 ? "PASS" : "FAIL"));

        // Test 3: [0,0,1,0,0,0,1,1] → 6
        System.out.println("Test 3 Brute  : " + (sol.findMaxLengthBrute(new int[]{0,0,1,0,0,0,1,1})   == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (sol.findMaxLengthOptimal(new int[]{0,0,1,0,0,0,1,1}) == 6 ? "PASS" : "FAIL"));

        // Test 4: [0,0,0,1,1,1] → 6 (entire array)
        System.out.println("Test 4 Brute  : " + (sol.findMaxLengthBrute(new int[]{0,0,0,1,1,1})    == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (sol.findMaxLengthOptimal(new int[]{0,0,0,1,1,1})  == 6 ? "PASS" : "FAIL"));
    }
}
