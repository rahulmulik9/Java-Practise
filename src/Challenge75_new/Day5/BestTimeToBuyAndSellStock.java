package Challenge75_new.Day5;

class SolBestTimeToBuyAndSellStock{
    public static int maxProfitBrute(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static int maxProfitOptimal(int[] prices) {
        int minPrice  = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

}

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        // Test 1: Normal case — buy at 1 sell at 6 → profit 5
        int[] t1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1 Brute  : " + (new SolBestTimeToBuyAndSellStock().maxProfitBrute(t1) == 5 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolBestTimeToBuyAndSellStock().maxProfitOptimal(t1) == 5 ? "PASS" : "FAIL"));

        // Test 2: Prices only go down — no profit possible → 0
        int[] t2 = {7, 6, 4, 3, 1};
        System.out.println("Test 2 Brute  : " + (new SolBestTimeToBuyAndSellStock().maxProfitBrute(t2) == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolBestTimeToBuyAndSellStock().maxProfitOptimal(t2) == 0 ? "PASS" : "FAIL"));

        // Test 3: Best buy is not first element — buy at 2 sell at 8 → profit 6
        int[] t3 = {5, 2, 8, 1, 4};
        System.out.println("Test 3 Brute  : " + (new SolBestTimeToBuyAndSellStock().maxProfitBrute(t3) == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolBestTimeToBuyAndSellStock().maxProfitOptimal(t3) == 6 ? "PASS" : "FAIL"));

        // Test 4: Single element — no transaction possible → 0
        int[] t4 = {5};
        System.out.println("Test 4 Brute  : " + (new SolBestTimeToBuyAndSellStock().maxProfitBrute(t4) == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolBestTimeToBuyAndSellStock().maxProfitOptimal(t4) == 0 ? "PASS" : "FAIL"));
    }
}
