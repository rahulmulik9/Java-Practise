package Challenge75_DSA.May.Day8;

class SolBestTimeToBuyAndSellStock {
    public static int maxProfitBrute(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++)
            for (int j = i + 1; j < prices.length; j++)
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
        return maxProfit;
    }

    public static int maxProfitOptimal(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            else maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolBestTimeToBuyAndSellStock().maxProfitBrute(new int[]{7,1,5,3,6,4})  == 5 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolBestTimeToBuyAndSellStock().maxProfitOptimal(new int[]{7,1,5,3,6,4}) == 5 ? "PASS" : "FAIL"));

        // Test 2: Prices only decrease — no profit possible
        System.out.println("Test 2 Brute  : " + (new SolBestTimeToBuyAndSellStock().maxProfitBrute(new int[]{7,6,4,3,1})  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolBestTimeToBuyAndSellStock().maxProfitOptimal(new int[]{7,6,4,3,1}) == 0 ? "PASS" : "FAIL"));

        // Test 3: Best buy is not on day 1
        System.out.println("Test 3 Brute  : " + (new SolBestTimeToBuyAndSellStock().maxProfitBrute(new int[]{3,8,1,9,2})  == 8 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolBestTimeToBuyAndSellStock().maxProfitOptimal(new int[]{3,8,1,9,2}) == 8 ? "PASS" : "FAIL"));

        // Test 4: Single element — no transaction possible
        System.out.println("Test 4 Brute  : " + (new SolBestTimeToBuyAndSellStock().maxProfitBrute(new int[]{5})  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolBestTimeToBuyAndSellStock().maxProfitOptimal(new int[]{5}) == 0 ? "PASS" : "FAIL"));
    }
}