package Challenge75_new.Day15;
class SolIsomorphicStrings {
    public static boolean isIsomorphicBrute(String s, String t) {
        java.util.Map<Character, Character> map = new java.util.HashMap<>();
        java.util.Set<Character> mapped = new java.util.HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (map.containsKey(sc)) { if (map.get(sc) != tc) return false; }
            else { if (mapped.contains(tc)) return false; map.put(sc, tc); mapped.add(tc); }
        }
        return true;
    }

    public static boolean isIsomorphicOptimal(String s, String t) {
        int[] mapS = new int[256], mapT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (mapS[sc] != mapT[tc]) return false;
            mapS[sc] = i + 1;
            mapT[tc] = i + 1;
        }
        return true;
    }
}

public class IsomorphicStrings {
    public static void main(String[] args) {
        SolIsomorphicStrings sol = new SolIsomorphicStrings();

        // Test 1: "egg" -> "add" → true
        System.out.println("Test 1 Brute  : " + (sol.isIsomorphicBrute("egg", "add") == true ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (sol.isIsomorphicOptimal("egg", "add") == true ? "PASS" : "FAIL"));

    }
    }
