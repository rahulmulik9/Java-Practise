package Challenge75_DSA.May.Day21;

class SolIsomorphicStrings {
    public static boolean isIsomorphicBrute(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                boolean sMatch = s.charAt(i) == s.charAt(j);
                boolean tMatch = t.charAt(i) == t.charAt(j);
                if (sMatch != tMatch) return false;
            }
        }
        return true;
    }

    public static boolean isIsomorphicOptimal(String s, String t) {
        int[] sToT = new int[128], tToS = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (sToT[sc] == 0 && tToS[tc] == 0) {
                sToT[sc] = tc;
                tToS[tc] = sc;
            } else if (sToT[sc] != tc || tToS[tc] != sc) {
                return false;
            }
        }
        return true;
    }
}

public class IsomorphicStrings {
    public static void main(String[] args) {
        // Test 1: Standard isomorphic case
        System.out.println("Test 1 Brute  : " + (new SolIsomorphicStrings().isIsomorphicBrute("egg", "add")   ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolIsomorphicStrings().isIsomorphicOptimal("egg", "add")  ? "PASS" : "FAIL"));

        // Test 2: Not isomorphic — one char maps to two
        System.out.println("Test 2 Brute  : " + (!new SolIsomorphicStrings().isIsomorphicBrute("foo", "bar")  ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (!new SolIsomorphicStrings().isIsomorphicOptimal("foo", "bar") ? "PASS" : "FAIL"));

        // Test 3: Two s chars map to same t char
        System.out.println("Test 3 Brute  : " + (!new SolIsomorphicStrings().isIsomorphicBrute("ab", "aa")    ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (!new SolIsomorphicStrings().isIsomorphicOptimal("ab", "aa")   ? "PASS" : "FAIL"));

        // Test 4: Longer isomorphic case
        System.out.println("Test 4 Brute  : " + (new SolIsomorphicStrings().isIsomorphicBrute("paper", "title")   ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolIsomorphicStrings().isIsomorphicOptimal("paper", "title")  ? "PASS" : "FAIL"));
    }
}