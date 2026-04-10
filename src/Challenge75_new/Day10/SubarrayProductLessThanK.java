package Challenge75_new.Day10;
class SolSubarrayProductLessThanK {

    public static int numSubarrayProductLessThanKBrute(int[] nums, int k) {
        if (k <= 1) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                if (product < k) count++;
                else break;
            }
        }
        return count;
    }
    public static int numSubarrayProductLessThanKOptimal(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0, product = 1, count = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];                  // expand window

            while (product >= k) {                   // shrink if invalid
                product /= nums[left];
                left++;
            }

            count += right - left + 1;               // count valid subarrays
        }
        return count;
    }
}
public class SubarrayProductLessThanK {
}
