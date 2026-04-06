package Challenge75_new.Day6;

class SolLongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstringBrute(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                boolean allUnique = true;
                boolean[] seen = new boolean[128];
                for (int k = i; k < j; k++) {
                    if (seen[s.charAt(k)]) { allUnique = false; break; }
                    seen[s.charAt(k)] = true;
                }
                if (allUnique) maxLen = Math.max(maxLen, j - i);
            }
        }
        return maxLen;
    }
}
public class LongestSubstringWithoutRepeatingCharacters {
}
