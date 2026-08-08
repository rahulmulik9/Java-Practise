package Challenge75_DSA.August.Day8;

public class ContainerWithMostWater {
}
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, water);
            if (height[left] <= height[right]) left++;
            else right--;
        }
        return max;
    }
}
