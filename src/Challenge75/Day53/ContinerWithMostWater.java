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
}

public class ContinerWithMostWater {
    public static void main(String[] args) {

    }
}
