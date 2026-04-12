package Challenge75_new.Day11;
class SolLongestRepeatingCharacterReplacement {

    public static int characterReplacementBrute(String s, int k) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            int maxFreq = 0;
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);
                int windowSize = j - i + 1;
                if (windowSize - maxFreq <= k) maxLen = Math.max(maxLen, windowSize);
                else break;
            }
        }
        return maxLen;
    }
}
public class LongestRepeatingCharacterReplacement {
}
