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

}
public class SubarrayProductLessThanK {
}
