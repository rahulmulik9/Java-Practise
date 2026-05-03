package Challenge75_DSA.May.Day3;

class SolTrappingRainWater {
    public static int trapBrute(int[] height) {
        int total = 0, n = height.length;
        for (int i = 1; i < n - 1; i++) {
            int leftMax = 0, rightMax = 0;
            for (int l = 0; l <= i; l++)  leftMax  = Math.max(leftMax,  height[l]);
            for (int r = i; r < n; r++)   rightMax = Math.max(rightMax, height[r]);
            total += Math.min(leftMax, rightMax) - height[i];
        }
        return total;
    }

    public static int trapOptimal(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, total = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                total += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                total += rightMax - height[right];
                right--;
            }
        }
        return total;
    }
}

public class TrappingRainWater {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolTrappingRainWater().trapBrute(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}) == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolTrappingRainWater().trapOptimal(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}) == 6 ? "PASS" : "FAIL"));

        // Test 2: LeetCode example 2
        System.out.println("Test 2 Brute  : " + (new SolTrappingRainWater().trapBrute(new int[]{4,2,0,3,2,5}) == 9 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolTrappingRainWater().trapOptimal(new int[]{4,2,0,3,2,5}) == 9 ? "PASS" : "FAIL"));

        // Test 3: No water trapped (monotonically increasing)
        System.out.println("Test 3 Brute  : " + (new SolTrappingRainWater().trapBrute(new int[]{1,2,3,4,5}) == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolTrappingRainWater().trapOptimal(new int[]{1,2,3,4,5}) == 0 ? "PASS" : "FAIL"));

        // Test 4: Single valley
        System.out.println("Test 4 Brute  : " + (new SolTrappingRainWater().trapBrute(new int[]{3,0,3}) == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolTrappingRainWater().trapOptimal(new int[]{3,0,3}) == 3 ? "PASS" : "FAIL"));
    }
}