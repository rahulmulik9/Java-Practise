package Challenge75_DSA.July.Day27;

import java.util.HashMap;

public class ContiniousArray {
}
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);   // prefix sum 0 seen at index -1 (before array starts)

        int prefixSum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 1) ? 1 : -1;  // treat 0 as -1

            if (map.containsKey(prefixSum)) {
                // same prefix sum seen before → subarray between has sum 0
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);  // store FIRST occurrence only
            }
        }
        return maxLen;

    }
}
