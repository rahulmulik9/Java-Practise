package Challenge75_new.Day3;
/*
* Imagine you're typing on a keyboard. Sometimes you hit backspace which deletes the last letter you typed.
* In this problem, # means backspace.s = "ab#c"
→ type a → "a"
→ type b → "ab"
→ hit #  → "a"   (b deleted)
→ type c → "ac"
t = "ad#c"
→ type a → "a"
→ type d → "ad"
→ hit #  → "a"   (d deleted)
→ type c → "ac"

Both give "ac" → return true ✅*/

class SolBackSpaceStringCompare{
    // BRUTE FORCE — O(n) time | O(n) space
    public boolean backspaceCompareBrute(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // OPTIMAL — O(n) time | O(1) space
    public boolean backspaceCompareOptimal(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {

            while (i >= 0) {
                if      (s.charAt(i) == '#') { skipS++; i--; }
                else if (skipS > 0)          { skipS--; i--; }
                else break;
            }

            while (j >= 0) {
                if      (t.charAt(j) == '#') { skipT++; j--; }
                else if (skipT > 0)          { skipT--; j--; }
                else break;
            }

            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;
            if ((i >= 0) != (j >= 0)) return false;

            i--; j--;
        }
        return true;
    }
}
public class BackSpaceStringCompare {
    public static void main(String[] args) {
        SolBackSpaceStringCompare sol = new SolBackSpaceStringCompare();

        System.out.println("=========================================");
        System.out.println("  Backspace String Compare -- Test Cases ");
        System.out.println("=========================================");

        // Test 1: LeetCode example 1 — basic match after backspace
        // s: ab#c -> ac | t: ad#c -> ac
        runTest(sol, 1, "Basic match after backspace",
                "ab#c", "ad#c", true);

        // Test 2: Both reduce to empty string
        // s: ab## -> "" | t: c#d# -> ""
        runTest(sol, 2, "Both reduce to empty",
                "ab##", "c#d#", true);

        // Test 3: Different final result
        // s: a#c -> c | t: b -> b
        runTest(sol, 3, "Different result",
                "a#c", "b", false);

        // Test 4: No backspaces — equal strings
        runTest(sol, 4, "No backspace, equal",
                "abc", "abc", true);

        // Test 5: No backspaces — not equal
        runTest(sol, 5, "No backspace, not equal",
                "abc", "abd", false);

        // Test 6: # at very start — nothing to delete
        // s: #a -> a | t: a -> a
        runTest(sol, 6, "Backspace at start",
                "#a", "a", true);

        // Test 7: Multiple backspaces in a row
        // s: a##b -> b | t: b -> b
        runTest(sol, 7, "Multiple backspaces in a row",
                "a##b", "b", true);

        // Test 8: All characters deleted
        // s: abc### -> "" | t: "" -> ""
        runTest(sol, 8, "All chars deleted",
                "abc###", "", true);

        // Test 9: Backspaces in middle
        // s: ab#c#d -> ad (b deleted, c deleted) | t: ad -> ad
        runTest(sol, 9, "Backspaces in middle",
                "ab#c#d", "ad", true);

        // Test 10: Single char equal
        runTest(sol, 10, "Single char equal",
                "a", "a", true);

        // Test 11: Single char not equal
        runTest(sol, 11, "Single char not equal",
                "a", "b", false);

        // Test 12: More backspaces than chars
        // s: ####a -> a | t: a -> a
        runTest(sol, 12, "More backspaces than chars",
                "####a", "a", true);

        System.out.println("=========================================");
    }

    private static void runTest(SolBackSpaceStringCompare sol, int num,
                                String desc,
                                String s, String t,
                                boolean expected) {
        boolean brute   = sol.backspaceCompareBrute(s, t);
        boolean optimal = sol.backspaceCompareOptimal(s, t);

        String bStatus = brute   == expected ? "PASS" : "FAIL";
        String oStatus = optimal == expected ? "PASS" : "FAIL";

        System.out.println("\nTest " + num + ": " + desc);
        System.out.println("  s = \"" + s + "\"  |  t = \"" + t + "\"");
        System.out.println("  Expected : " + expected);
        System.out.println("  Brute    : " + brute   + "  [" + bStatus + "]");
        System.out.println("  Optimal  : " + optimal + "  [" + oStatus + "]");
    }
}
