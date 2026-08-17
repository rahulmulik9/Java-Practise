package Challenge75_DSA.August.Day17;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidPrenthesis {
}
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (final char c : s.toCharArray())
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;

        return stack.isEmpty();
    }
}
