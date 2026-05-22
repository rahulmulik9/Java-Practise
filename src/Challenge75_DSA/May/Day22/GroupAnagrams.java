package Challenge75_DSA.May.Day22;

import java.util.*;

class SolGroupAnagrams {
    public static List<List<String>> groupAnagramsBrute(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagramsOptimal(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) count[c - 'a']++;
            StringBuilder key = new StringBuilder();
            for (int freq : count) key.append(freq).append('#');
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    // helper: compare grouped results regardless of order
    public static boolean sameGroups(List<List<String>> a, List<List<String>> b) {
        if (a.size() != b.size()) return false;
        Set<Set<String>> setA = new HashSet<>(), setB = new HashSet<>();
        for (List<String> g : a) setA.add(new HashSet<>(g));
        for (List<String> g : b) setB.add(new HashSet<>(g));
        return setA.equals(setB);
    }
}

public class GroupAnagrams {
    public static void main(String[] args) {
        List<List<String>> expected1 = Arrays.asList(
                Arrays.asList("eat","tea","ate"),
                Arrays.asList("tan","nat"),
                Arrays.asList("bat")
        );

        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (SolGroupAnagrams.sameGroups(SolGroupAnagrams.groupAnagramsBrute(new String[]{"eat","tea","tan","ate","nat","bat"}),  expected1) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolGroupAnagrams.sameGroups(SolGroupAnagrams.groupAnagramsOptimal(new String[]{"eat","tea","tan","ate","nat","bat"}), expected1) ? "PASS" : "FAIL"));

        // Test 2: All strings are anagrams of each other
        List<List<String>> expected2 = Arrays.asList(Arrays.asList("abc","bca","cab"));
        System.out.println("Test 2 Brute  : " + (SolGroupAnagrams.sameGroups(SolGroupAnagrams.groupAnagramsBrute(new String[]{"abc","bca","cab"}),  expected2) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolGroupAnagrams.sameGroups(SolGroupAnagrams.groupAnagramsOptimal(new String[]{"abc","bca","cab"}), expected2) ? "PASS" : "FAIL"));

        // Test 3: No anagrams — each string is its own group
        List<List<String>> expected3 = Arrays.asList(
                Arrays.asList("abc"), Arrays.asList("def"), Arrays.asList("ghi")
        );
        System.out.println("Test 3 Brute  : " + (SolGroupAnagrams.sameGroups(SolGroupAnagrams.groupAnagramsBrute(new String[]{"abc","def","ghi"}),  expected3) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolGroupAnagrams.sameGroups(SolGroupAnagrams.groupAnagramsOptimal(new String[]{"abc","def","ghi"}), expected3) ? "PASS" : "FAIL"));

        // Test 4: Single empty string
        List<List<String>> expected4 = Arrays.asList(Arrays.asList(""));
        System.out.println("Test 4 Brute  : " + (SolGroupAnagrams.sameGroups(SolGroupAnagrams.groupAnagramsBrute(new String[]{""}),  expected4) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolGroupAnagrams.sameGroups(SolGroupAnagrams.groupAnagramsOptimal(new String[]{""}), expected4) ? "PASS" : "FAIL"));
    }
}