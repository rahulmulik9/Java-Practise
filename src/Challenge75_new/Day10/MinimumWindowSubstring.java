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
}

public class MinimumWindowSubstring {
}
