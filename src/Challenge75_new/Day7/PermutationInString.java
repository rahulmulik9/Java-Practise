package Challenge75_new.Day7;


import java.util.Arrays;

class SolPermutationInString {

    public static boolean checkInclusionBrute(String s1, String s2) {
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
}
public class PermutationInString {
}
