package Challenge75.Day3;

/*Given an integer array nums, find the subarray with the largest sum, and return its sum.*/
public class Question1 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {5,4,-1,7,8};
        int[] nums3 = {-1};
        System.out.println(maxSubArray(nums3));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length ; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
            sum = 0;
        }
        return max;
    }
}
