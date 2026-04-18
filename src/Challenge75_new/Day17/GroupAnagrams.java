package Challenge75_new.Day17;

import java.util.*;

class SolGroupAnagrams {

    public static List<List<String>> groupAnagramsBrute(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagramsOptimal(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) freq[c - 'a']++;
            StringBuilder key = new StringBuilder();
            for (int f : freq) { key.append(f); key.append('#'); }
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

public class GroupAnagrams {
    public static void main(String[] args) {

        // Test 1: classic example → 3 groups
        List<List<String>> r1b = new SolGroupAnagrams().groupAnagramsBrute(new String[]{"eat","tea","tan","ate","nat","bat"});
        List<List<String>> r1o = new SolGroupAnagrams().groupAnagramsOptimal(new String[]{"eat","tea","tan","ate","nat","bat"});
        System.out.println("Test 1 Brute  : " + (r1b.size() == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (r1o.size() == 3 ? "PASS" : "FAIL"));

        // Test 2: all same word → 1 group
        List<List<String>> r2b = new SolGroupAnagrams().groupAnagramsBrute(new String[]{"aaa","aaa","aaa"});
        List<List<String>> r2o = new SolGroupAnagrams().groupAnagramsOptimal(new String[]{"aaa","aaa","aaa"});
        System.out.println("Test 2 Brute  : " + (r2b.size() == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (r2o.size() == 1 ? "PASS" : "FAIL"));

        // Test 3: single word → 1 group of 1
        List<List<String>> r3b = new SolGroupAnagrams().groupAnagramsBrute(new String[]{"a"});
        List<List<String>> r3o = new SolGroupAnagrams().groupAnagramsOptimal(new String[]{"a"});
        System.out.println("Test 3 Brute  : " + (r3b.size() == 1 && r3b.get(0).size() == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (r3o.size() == 1 && r3o.get(0).size() == 1 ? "PASS" : "FAIL"));

        // Test 4: no anagrams → each word in own group
        List<List<String>> r4b = new SolGroupAnagrams().groupAnagramsBrute(new String[]{"abc","def","ghi"});
        List<List<String>> r4o = new SolGroupAnagrams().groupAnagramsOptimal(new String[]{"abc","def","ghi"});
        System.out.println("Test 4 Brute  : " + (r4b.size() == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (r4o.size() == 3 ? "PASS" : "FAIL"));
    }
}
