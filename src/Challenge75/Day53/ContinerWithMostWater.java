package Challenge75.Day53;

class SolutionCWM {

    // ─────────────────────────────────────────────
    // BRUTE FORCE  →  O(n²) time | O(1) space
    // Try every pair (i, j) and track the maximum water
    // ─────────────────────────────────────────────
    public int maxAreaBruteForce(int[] height) {
        int maxWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                // Water = shorter wall × distance between walls
                int water = Math.min(height[i], height[j]) * (j - i);
                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }


    // ─────────────────────────────────────────────
    // OPTIMAL (Two Pointer)  →  O(n) time | O(1) space
    // Start from both ends, always move the shorter wall inward
    // ─────────────────────────────────────────────
    public int maxAreaOptimal(int[] height) {
        int left  = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            // Water = shorter wall × distance between pointers
            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, water);

            // Move the shorter wall inward — moving the taller one can never help
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}

public class ContinerWithMostWater {
    public static void main(String[] args) {

    }
}
