package Challenge75_new.Day16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SolLongestConsecutiveSequence {
    public static int longestConsecutiveBrute(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxLen = 1, curLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            if (nums[i] == nums[i - 1] + 1) curLen++;
            else curLen = 1;
            maxLen = Math.max(maxLen, curLen);
        }
        return maxLen;
    }
    public static int longestConsecutiveOptimal(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int maxLen = 0;
        for (int n : set) {
            if (set.contains(n - 1)) continue;
            int cur = n, len = 1;
            while (set.contains(cur + 1)) { cur++; len++; }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        SolLongestConsecutiveSequence sol = new SolLongestConsecutiveSequence();

        // Test 1: [100,4,200,1,3,2] → 4
        System.out.println("Test 1 Brute  : " + (sol.longestConsecutiveBrute(new int[]{100, 4, 200, 1, 3, 2}) == 4 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (sol.longestConsecutiveOptimal(new int[]{100, 4, 200, 1, 3, 2}) == 4 ? "PASS" : "FAIL"));
    }
    }
