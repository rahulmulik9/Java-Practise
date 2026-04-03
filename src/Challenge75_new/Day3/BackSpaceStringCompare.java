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
}
public class BackSpaceStringCompare {
}
