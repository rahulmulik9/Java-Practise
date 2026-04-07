package Challenge75_new.Day7;


import java.util.Arrays;

class SolPermutationInString {

    public boolean checkInclusionBrute(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        char[] sorted1 = s1.toCharArray();
        Arrays.sort(sorted1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            char[] sub = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(sub);
            if (Arrays.equals(sorted1, sub)) return true;
        }
        return false;
    }

    public boolean checkInclusionOptimal(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(freq1, freq2)) return true;
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - s1.length()) - 'a']--;
        }
        return Arrays.equals(freq1, freq2);
    }
}

public class PermutationInString {
    public static void main(String[] args) {

        // Test 1: "ba" is permutation of "ab" found in "eidbaooo" → true
        System.out.println("Test 1 Brute  : " + (new SolPermutationInString().checkInclusionBrute("ab", "eidbaooo") == true ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolPermutationInString().checkInclusionOptimal("ab", "eidbaooo") == true ? "PASS" : "FAIL"));

        // Test 2: no permutation of "ab" in "eidboaoo" → false
        System.out.println("Test 2 Brute  : " + (new SolPermutationInString().checkInclusionBrute("ab", "eidboaoo") == false ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolPermutationInString().checkInclusionOptimal("ab", "eidboaoo") == false ? "PASS" : "FAIL"));
    }
}