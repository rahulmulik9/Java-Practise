package Challenge75.Day2;

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1*/

import java.util.HashSet;
import java.util.stream.Collectors;

public class First_non_reapting_character {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstNonRep(s));
    }

    private static int firstNonRep(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find first char with freq 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }
}
