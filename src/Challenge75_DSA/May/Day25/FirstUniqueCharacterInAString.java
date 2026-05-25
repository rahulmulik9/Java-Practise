package Challenge75_DSA.May.Day25;


class SolFirstUniqueCharacterInAString {
    public static int firstUniqCharBrute(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) { unique = false; break; }
            }
            if (unique) return i;
        }
        return -1;
    }

    public static int firstUniqCharOptimal(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (int i = 0; i < s.length(); i++)
            if (count[s.charAt(i) - 'a'] == 1) return i;
        return -1;
    }
}

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        // Test 1: First character is unique
        System.out.println("Test 1 Brute  : " + (new SolFirstUniqueCharacterInAString().firstUniqCharBrute("leetcode")  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolFirstUniqueCharacterInAString().firstUniqCharOptimal("leetcode") == 0 ? "PASS" : "FAIL"));

        // Test 2: Unique character is not first
        System.out.println("Test 2 Brute  : " + (new SolFirstUniqueCharacterInAString().firstUniqCharBrute("loveleetcode")  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolFirstUniqueCharacterInAString().firstUniqCharOptimal("loveleetcode") == 2 ? "PASS" : "FAIL"));

        // Test 3: No unique character
        System.out.println("Test 3 Brute  : " + (new SolFirstUniqueCharacterInAString().firstUniqCharBrute("aabb")  == -1 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolFirstUniqueCharacterInAString().firstUniqCharOptimal("aabb") == -1 ? "PASS" : "FAIL"));

        // Test 4: Single character string
        System.out.println("Test 4 Brute  : " + (new SolFirstUniqueCharacterInAString().firstUniqCharBrute("z")  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolFirstUniqueCharacterInAString().firstUniqCharOptimal("z") == 0 ? "PASS" : "FAIL"));
    }
}