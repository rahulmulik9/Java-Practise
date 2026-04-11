package Challenge75_new.Day10;

class SolMinimumWindowSubstring {
    public static String minWindowBrute(String s, String t) {
        if (s.length() < t.length()) return "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + t.length(); j <= s.length(); j++) {
                String sub = s.substring(i, j);
                int[] freq = new int[128];
                for (char c : t.toCharArray()) freq[c]++;
                for (char c : sub.toCharArray()) freq[c]--;
                boolean valid = true;
                for (int f : freq) if (f > 0) { valid = false; break; }
                if (valid && (result.isEmpty() || sub.length() < result.length()))
                    result = sub;
            }
        }
        return result;
    }
    public static String minWindowOptimal(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] need = new int[128];
        int[] have = new int[128];
        for (char c : t.toCharArray()) need[c]++;
        int required = 0;
        for (int f : need) if (f > 0) required++;
        int formed = 0, left = 0, minLen = Integer.MAX_VALUE, start = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            have[c]++;
            if (need[c] > 0 && have[c] == need[c]) formed++;
            while (formed == required) {
                if (right - left + 1 < minLen) { minLen = right - left + 1; start = left; }
                char l = s.charAt(left);
                have[l]--;
                if (need[l] > 0 && have[l] < need[l]) formed--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        // Test 1: Classic example → "BANC"
        System.out.println("Test 1 Brute  : " + (new SolMinimumWindowSubstring().minWindowBrute("ADOBECODEBANC", "ABC").equals("BANC")  ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolMinimumWindowSubstring().minWindowOptimal("ADOBECODEBANC", "ABC").equals("BANC") ? "PASS" : "FAIL"));
    }
}
