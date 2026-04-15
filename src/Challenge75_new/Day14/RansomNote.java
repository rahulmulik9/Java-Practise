package Challenge75_new.Day14;

class SolRansomNote {

    public static boolean canConstructBrute(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        for (char c : ransomNote.toCharArray()) {
            int idx = sb.indexOf(String.valueOf(c));
            if (idx == -1) return false;
            sb.deleteCharAt(idx);
        }
        return true;
    }
    public static boolean canConstructOptimal(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c : magazine.toCharArray())    freq[c - 'a']++;
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) return false;
        }
        return true;
    }
}
public class RansomNote {
}
