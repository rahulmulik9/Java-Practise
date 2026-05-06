package Challenge75_DSA.May.Day6;


class SolBackspaceStringCompare {
    public static boolean backspaceCompareBrute(String s, String t) {
        return build(s).equals(build(t));
    }

    private static String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '#') { if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); }
            else sb.append(c);
        }
        return sb.toString();
    }

    public static boolean backspaceCompareOptimal(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1, skipS = 0, skipT = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#')   { skipS++; i--; }
                else if (skipS > 0)        { skipS--; i--; }
                else break;
            }
            while (j >= 0) {
                if (t.charAt(j) == '#')   { skipT++; j--; }
                else if (skipT > 0)        { skipT--; j--; }
                else break;
            }
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;
            if ((i >= 0) != (j >= 0)) return false;
            i--; j--;
        }
        return true;
    }
}

public class BackspaceStringCompare {
    public static void main(String[] args) {
        // Test 1: Both match after backspace
        System.out.println("Test 1 Brute  : " + (new SolBackspaceStringCompare().backspaceCompareBrute("ab#c", "ad#c")   ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolBackspaceStringCompare().backspaceCompareOptimal("ab#c", "ad#c")  ? "PASS" : "FAIL"));

        // Test 2: Both become empty
        System.out.println("Test 2 Brute  : " + (new SolBackspaceStringCompare().backspaceCompareBrute("##", "#")         ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolBackspaceStringCompare().backspaceCompareOptimal("##", "#")        ? "PASS" : "FAIL"));

        // Test 3: Do not match
        System.out.println("Test 3 Brute  : " + (!new SolBackspaceStringCompare().backspaceCompareBrute("a#c", "b")       ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (!new SolBackspaceStringCompare().backspaceCompareOptimal("a#c", "b")      ? "PASS" : "FAIL"));

        // Test 4: Multiple consecutive backspaces
        System.out.println("Test 4 Brute  : " + (new SolBackspaceStringCompare().backspaceCompareBrute("xywrrmp", "xywrrmu#p") ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolBackspaceStringCompare().backspaceCompareOptimal("xywrrmp", "xywrrmu#p") ? "PASS" : "FAIL"));
    }
}