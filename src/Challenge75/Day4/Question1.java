package Challenge75.Day4;
/*152. Maximum Product Subarray*/
public class Question1 {
    static int maxProductSubArray(int arr[]) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++)
                    prod *= arr[k];
                result = Math.max(result, prod);
            }
        return result;
    }
    static int maxProductSubArray1(int nums[]) {
        int res = Integer.MIN_VALUE;
        for (int n : nums) {
            res = Math.max(res, n);
        }

        int curMax = 1, curMin = 1;

        for (int n : nums) {
            int temp = curMax * n;
            curMax = Math.max(temp, Math.max(curMin * n, n));
            curMin = Math.min(temp, Math.min(curMin * n, n));

            res = Math.max(res, curMax);
        }

        return res;
    }



    public static void main(String[] args) {
        int nums[] = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray1(nums);
        System.out.print("The maximum product subarray is: " + answer);
    }
}
