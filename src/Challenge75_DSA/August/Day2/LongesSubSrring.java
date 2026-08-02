package Challenge75_DSA.August.Day2;

public class LongesSubSrring {
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        java.util.Map<Character, Integer> lastIndex = new java.util.HashMap<>();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
                left = lastIndex.get(c) + 1;
            }
            lastIndex.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}