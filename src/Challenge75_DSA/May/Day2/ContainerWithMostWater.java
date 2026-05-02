package Challenge75_DSA.May.Day2;


class SolContainerWithMostWater {
    public static int maxAreaBrute(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
        return max;
    }

    public static int maxAreaOptimal(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right]) left++;
            else right--;
        }
        return max;
    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolContainerWithMostWater().maxAreaBrute(new int[]{1,8,6,2,5,4,8,3,7}) == 49 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolContainerWithMostWater().maxAreaOptimal(new int[]{1,8,6,2,5,4,8,3,7}) == 49 ? "PASS" : "FAIL"));

        // Test 2: Two walls only
        System.out.println("Test 2 Brute  : " + (new SolContainerWithMostWater().maxAreaBrute(new int[]{1,1}) == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolContainerWithMostWater().maxAreaOptimal(new int[]{1,1}) == 1 ? "PASS" : "FAIL"));

        // Test 3: Increasing heights — best at far ends
        System.out.println("Test 3 Brute  : " + (new SolContainerWithMostWater().maxAreaBrute(new int[]{1,2,3,4,5}) == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolContainerWithMostWater().maxAreaOptimal(new int[]{1,2,3,4,5}) == 6 ? "PASS" : "FAIL"));

        // Test 4: All same height
        System.out.println("Test 4 Brute  : " + (new SolContainerWithMostWater().maxAreaBrute(new int[]{4,4,4,4}) == 12 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolContainerWithMostWater().maxAreaOptimal(new int[]{4,4,4,4}) == 12 ? "PASS" : "FAIL"));
    }
}