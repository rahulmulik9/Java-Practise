package Challenge75_new.Day16;

import java.util.Arrays;

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
}

public class LongestConsecutiveSequence {
}
