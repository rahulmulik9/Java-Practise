package Challenge75_new.Day12;

import java.util.HashMap;

class SolSubarraySumEqualsK {

    public static int subarraySumBrute(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) count++;
            }
        }
        return count;
    }
    public static int subarraySumOptimal(int[] nums, int k) {
        HashMap<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        int prefixSum = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (prefixCount.containsKey(prefixSum - k))
                count += prefixCount.get(prefixSum - k);
            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}

public class SubarraySumEqualsK {
}
