package Challenge75.Day27;
/*Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.


Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation:
The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"

Output: false
*/

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(new PatterSolutions().checkPatternExistOrNot(pattern, s));
    }
}

class PatterSolutions {
    boolean checkPatternExistOrNot(String pattern, String s) {

        char[] patternAty = pattern.toCharArray();
        String[] stryAry = s.split(" ");

        if (patternAty.length != stryAry.length) return false;

        HashMap<Character, String> storeMpa = new HashMap<>();
        for (int i = 0; i < patternAty.length; i++) {
            if (storeMpa.containsKey(patternAty[i])) {
                String values = storeMpa.get(patternAty[i]);
                String requiredvaue = stryAry[i];
                if (!values.equals(requiredvaue)) {
                    return false;
                }
            }else{
             storeMpa.put(patternAty[i],stryAry[i]) ;
            }
        }
        return true;
    }
}
