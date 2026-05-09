package Challenge75_DSA.May.Day9;

class SolLongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstringBrute(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            java.util.Set<Character> seen = new java.util.HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (!seen.add(s.charAt(j))) break;
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstringOptimal(String s) {
        java.util.Map<Character, Integer> lastIndex = new java.util.HashMap<>();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left)
                left = lastIndex.get(c) + 1;
            lastIndex.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringBrute("abcabcbb")  == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringOptimal("abcabcbb") == 3 ? "PASS" : "FAIL"));

        // Test 2: All same characters
        System.out.println("Test 2 Brute  : " + (new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringBrute("bbbbb")  == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringOptimal("bbbbb") == 1 ? "PASS" : "FAIL"));

        // Test 3: Duplicate seen before current window — tests >= left guard
        System.out.println("Test 3 Brute  : " + (new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringBrute("abba")  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringOptimal("abba") == 2 ? "PASS" : "FAIL"));

        // Test 4: All unique characters
        System.out.println("Test 4 Brute  : " + (new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringBrute("abcdef")  == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringOptimal("abcdef") == 6 ? "PASS" : "FAIL"));
    }
}