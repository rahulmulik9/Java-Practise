package Challenge75_DSA.July.Day28;

public class Max {
}

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;           // Left pointer of the sliding window
        int zeroCount = 0;      // Count of zeros in the current window

        // Iterate through the array with an implicit right pointer
        for (int num : nums) {
            // If current element is 0, increment zero count (num ^ 1 equals 1 when num is 0)
            zeroCount += num ^ 1;

            // If we have more than k zeros, shrink window from left
            if (zeroCount > k) {
                // If the left element being removed is 0, decrement zero count
                zeroCount -= nums[left] ^ 1;
                left++;  // Move left pointer to shrink the window
            }
        }

        // The maximum window size is the array length minus the final left position
        // This works because the window only shrinks when necessary, maintaining max size
        return nums.length - left;
    }
}
