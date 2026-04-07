package Challenge75_new.Day6;

import java.util.HashMap;

class SolLongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstringBrute(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                boolean allUnique = true;
                boolean[] seen = new boolean[128];
                for (int k = i; k < j; k++) {
                    if (seen[s.charAt(k)]) {
                        allUnique = false;
                        break;
                    }
                    seen[s.charAt(k)] = true;
                }
                if (allUnique) maxLen = Math.max(maxLen, j - i);
            }
        }
        return maxLen;
    }

    public static int lengthOfLongestSubstringOptimal(String s) {
        int left = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // If char already in window, move left past its last occurrence
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }

            map.put(c, right);  // update latest index of char
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        // Test 1: "abcabcbb" → longest is "abc" = 3
       // int t1 = new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringBrute("abcabcbb");
        int t2 = new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringOptimal("abcabcbb");
        //System.out.println("Test 1 Brute  : " + (t1 == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: "+(t2==3?"PASS":"FAIL"));
    }
}
