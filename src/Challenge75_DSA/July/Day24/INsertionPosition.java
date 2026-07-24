package Challenge75_DSA.July.Day24;

public class INsertionPosition {
}


class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int firstTrueIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // If firstTrueIndex is -1, all elements are smaller than target
        // Insert at the end
        return firstTrueIndex != -1 ? firstTrueIndex : n;
    }
}
//git changes