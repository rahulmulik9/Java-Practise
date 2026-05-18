package Challenge75_DSA.May.Day18;

class SolRansomNote {
    public static boolean canConstructBrute(String ransomNote, String magazine) {
        StringBuilder mag = new StringBuilder(magazine);
        for (char c : ransomNote.toCharArray()) {
            int idx = mag.indexOf(String.valueOf(c));
            if (idx == -1) return false;
            mag.deleteCharAt(idx);
        }
        return true;
    }

    public static boolean canConstructOptimal(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray())   count[c - 'a']++;
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }
        return true;
    }
}

public class RansomNote {
    public static void main(String[] args) {
        // Test 1: Magazine has enough letters
        System.out.println("Test 1 Brute  : " + (new SolRansomNote().canConstructBrute("aa", "aab")   ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolRansomNote().canConstructOptimal("aa", "aab")  ? "PASS" : "FAIL"));

        // Test 2: Magazine does not have enough of one letter
        System.out.println("Test 2 Brute  : " + (!new SolRansomNote().canConstructBrute("aab", "ab")  ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (!new SolRansomNote().canConstructOptimal("aab", "ab") ? "PASS" : "FAIL"));

        // Test 3: RansomNote letter not in magazine at all
        System.out.println("Test 3 Brute  : " + (!new SolRansomNote().canConstructBrute("z", "abcde") ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (!new SolRansomNote().canConstructOptimal("z", "abcde")? "PASS" : "FAIL"));

        // Test 4: Magazine has far more letters than needed
        System.out.println("Test 4 Brute  : " + (new SolRansomNote().canConstructBrute("a", "aaaaab")   ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolRansomNote().canConstructOptimal("a", "aaaaab")  ? "PASS" : "FAIL"));
    }
}