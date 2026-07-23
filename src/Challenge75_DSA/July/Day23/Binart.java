package Challenge75_DSA.July.Day23;

public class Binart {
}

class Solution {
    /**
     * Binary search to find the target element in a sorted array.
     * Returns the index of the target if found, otherwise returns -1.
     *
     * @param nums   sorted array of integers
     * @param target the value to search for
     * @return index of target if found, -1 otherwise
     */
    public int search(int[] nums, int target) {
        // Initialize left and right pointers for binary search
        int left = 0;
        int right = nums.length - 1;
        int firstTrueIndex = -1;

        // Binary search using the template: find first index where nums[mid] >= target
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Check if the element at firstTrueIndex equals target
        // Return the index if found, otherwise return -1
        if (firstTrueIndex != -1 && nums[firstTrueIndex] == target) {
            return firstTrueIndex;
        }
        return -1;
    }
}
