package Challenge75_DSA.May.Day10;


class SolPermutationInString {
    public static boolean checkInclusionBrute(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        char[] sorted1 = s1.toCharArray();
        java.util.Arrays.sort(sorted1);
        int m = s1.length();
        for (int i = 0; i <= s2.length() - m; i++) {
            char[] window = s2.substring(i, i + m).toCharArray();
            java.util.Arrays.sort(window);
            if (java.util.Arrays.equals(sorted1, window)) return true;
        }
        return false;
    }

    public static boolean checkInclusionOptimal(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] count1 = new int[26], count2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int i = 0; i < 26; i++) if (count1[i] == count2[i]) matches++;
        int left = 0;
        for (int right = s1.length(); right < s2.length(); right++) {
            if (matches == 26) return true;
            int rIdx = s2.charAt(right) - 'a';
            count2[rIdx]++;
            if (count2[rIdx] == count1[rIdx])            matches++;
            else if (count2[rIdx] == count1[rIdx] + 1)  matches--;
            int lIdx = s2.charAt(left) - 'a';
            count2[lIdx]--;
            if (count2[lIdx] == count1[lIdx])            matches++;
            else if (count2[lIdx] == count1[lIdx] - 1)  matches--;
            left++;
        }
        return matches == 26;
    }
}

public class PermutationInString {
    public static void main(String[] args) {
        // Test 1: Permutation exists mid-string
        System.out.println("Test 1 Brute  : " + (new SolPermutationInString().checkInclusionBrute("ab", "eidbaooo")   ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolPermutationInString().checkInclusionOptimal("ab", "eidbaooo")  ? "PASS" : "FAIL"));

        // Test 2: No permutation exists
        System.out.println("Test 2 Brute  : " + (!new SolPermutationInString().checkInclusionBrute("ab", "eidboaoo")  ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (!new SolPermutationInString().checkInclusionOptimal("ab", "eidboaoo") ? "PASS" : "FAIL"));

        // Test 3: s1 longer than s2
        System.out.println("Test 3 Brute  : " + (!new SolPermutationInString().checkInclusionBrute("hello", "hi")     ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (!new SolPermutationInString().checkInclusionOptimal("hello", "hi")    ? "PASS" : "FAIL"));

        // Test 4: Exact match — s1 equals s2
        System.out.println("Test 4 Brute  : " + (new SolPermutationInString().checkInclusionBrute("abc", "cba")       ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolPermutationInString().checkInclusionOptimal("abc", "cba")      ? "PASS" : "FAIL"));
    }
}