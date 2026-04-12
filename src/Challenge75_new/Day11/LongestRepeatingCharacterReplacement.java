package Challenge75_new.Day11;
class SolLongestRepeatingCharacterReplacement {

    public static int characterReplacementBrute(String s, int k) {
        int maxLen = 0;

        // Try every starting point
        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26]; // count each letter in current window
            int maxFreq = 0;          // most frequent letter count

            // Try every ending point
            for (int j = i; j < s.length(); j++) {

                // Add new character to window
                freq[s.charAt(j) - 'A']++;

                // Update most frequent count
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

                int windowSize = j - i + 1;

                // How many chars need replacing?
                int replacementsNeeded = windowSize - maxFreq;

                if (replacementsNeeded <= k) {
                    // Window is valid! Update answer
                    maxLen = Math.max(maxLen, windowSize);
                } else {
                    // Window is invalid and only gets worse → stop early
                    break;
                }
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
