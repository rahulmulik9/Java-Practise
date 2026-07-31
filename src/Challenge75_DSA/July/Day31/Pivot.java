package Challenge75_DSA.July.Day31;

public class Pivot {
}

class Solution {
    /**
     * Finds the pivot index where the sum of elements to the left equals
     * the sum of elements to the right.
     *
     * @param nums The input array of integers
     * @return The pivot index if found, otherwise -1
     */
    public int pivotIndex(int[] nums) {
        // Initialize left sum as 0
        int leftSum = 0;

        // Calculate total sum of all elements (initially used as right sum)
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        // Iterate through each index to find the pivot
        for (int i = 0; i < nums.length; i++) {
            // Subtract current element from right sum
            rightSum -= nums[i];

            // Check if left sum equals right sum at current index
            if (leftSum == rightSum) {
                return i;  // Found pivot index
            }

            // Add current element to left sum for next iteration
            leftSum += nums[i];
        }

        // No pivot index found
        return -1;
    }
}
