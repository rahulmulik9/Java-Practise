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
        int left = 0;
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

        SolutionCWM solution = new SolutionCWM();

        // ── Test Case 1: LeetCode example ──────────────────────────────
        // heights:  [1, 8, 6, 2, 5, 4, 8, 3, 7]
        // Best pair: index 1 (h=8) and index 8 (h=7) → min(8,7) × 7 = 49
        int[] test1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        runTest(solution, "Test 1 - LeetCode example", test1, 49);

        // ── Test Case 2: Two elements only ─────────────────────────────
        // Only one pair possible → min(1,1) × 1 = 1
        int[] test2 = {1, 1};
        runTest(solution, "Test 2 - Two elements", test2, 1);

        // ── Test Case 3: Increasing heights ────────────────────────────
        // Best pair: index 0 (h=1) and index 4 (h=5) → min(1,5) × 4 = 4
        // Or index 1 (h=2) and index 4 (h=5) → min(2,5) × 3 = 6
        // Or index 2 (h=3) and index 4 (h=5) → min(3,5) × 2 = 6
        // Or index 3 (h=4) and index 4 (h=5) → min(4,5) × 1 = 4
        // Best = 6
        int[] test3 = {1, 2, 3, 4, 5};
        runTest(solution, "Test 3 - Increasing heights", test3, 6);

        // ── Test Case 4: Decreasing heights ────────────────────────────
        // Mirror of test 3 → Best = 6
        int[] test4 = {5, 4, 3, 2, 1};
        runTest(solution, "Test 4 - Decreasing heights", test4, 6);

        // ── Test Case 5: All same heights ──────────────────────────────
        // Best pair: index 0 and index 4 → min(4,4) × 4 = 16
        int[] test5 = {4, 4, 4, 4, 4};
        runTest(solution, "Test 5 - All same heights", test5, 16);

        // ── Test Case 6: One very tall wall in the middle ───────────────
        // Tall middle bar doesn't help — best is outermost pair
        // min(3,3) × 4 = 12
        int[] test6 = {3, 1, 9, 1, 3};
        runTest(solution, "Test 6 - Tall wall in middle", test6, 12);

        // ── Test Case 7: Large input edge case ─────────────────────────
        // Best pair: index 0 (h=10000) and index 1 (h=10000) → 10000
        int[] test7 = {10000, 10000};
        runTest(solution, "Test 7 - Max height values", test7, 10000);
    }

    // ── Helper: runs both methods and prints pass/fail ──────────────────
    private static void runTest(SolutionCWM solution,
                                String testName,
                                int[] heights,
                                int expected) {

        int bruteResult = solution.maxAreaBruteForce(heights);
        int optimalResult = solution.maxAreaOptimal(heights);

        String bruteStatus = (bruteResult == expected) ? "PASS" : "FAIL";
        String optimalStatus = (optimalResult == expected) ? "PASS" : "FAIL";

        System.out.println("─────────────────────────────────────");
        System.out.println(testName);
        System.out.println("Expected  : " + expected);
        System.out.println("Brute     : " + bruteResult + "  [" + bruteStatus + "]");
        System.out.println("Optimal   : " + optimalResult + "  [" + optimalStatus + "]");
    }
}

