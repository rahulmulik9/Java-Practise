package Challenge75_new.Day20;

class SolFirstUniqueCharacterInAString {

    public static int firstUniqCharBrute(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) count++;
            }
            if (count == 1) return i;
        }
        return -1;
    }

    public static int firstUniqCharOptimal(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {

        // Test 1: "leetcode" → 'l' at index 0 is first unique
        System.out.println("Test 1 Brute  : " + (new SolFirstUniqueCharacterInAString().firstUniqCharBrute("leetcode") == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolFirstUniqueCharacterInAString().firstUniqCharOptimal("leetcode") == 0 ? "PASS" : "FAIL"));
    }
}
