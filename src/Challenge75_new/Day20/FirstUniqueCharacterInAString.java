package Challenge75_new.Day20;

class SolFirstUniqueCharacterInAString {

    public static int firstUniqCharBrute(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) count++;
            }
            if (count == 1) return i;
        }
        return -1;
    }

}

public class FirstUniqueCharacterInAString {
}
