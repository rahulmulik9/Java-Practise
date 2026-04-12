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

    public static int characterReplacementOptimal(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // chars to replace = window size - most frequent char count
            int windowSize = right - left + 1;
            if (windowSize - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;  // shrink from left
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
public class LongestRepeatingCharacterReplacement {
}
