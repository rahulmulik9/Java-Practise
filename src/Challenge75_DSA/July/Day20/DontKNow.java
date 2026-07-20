package Challenge75_DSA.July.Day20;

public class DontKNow {
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        java.util.Map<Integer, Integer> prefixCount = new java.util.HashMap<>();
        prefixCount.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            count += prefixCount.getOrDefault(sum - k, 0);
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
