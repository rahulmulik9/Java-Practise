package Challenge75_DSA.June.Day6;

class SolValidParentheses {

    public static boolean isValidBrute(String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.isEmpty();
    }

    public static boolean isValidOptimal(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {

        // Test 1: Perfectly nested → true
        System.out.println("Test 1 Brute  : " + (SolValidParentheses.isValidBrute("{[()]}") == true  ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolValidParentheses.isValidOptimal("{[()]}") == true ? "PASS" : "FAIL"));

        // Test 2: Wrong closing order → false
        System.out.println("Test 2 Brute  : " + (SolValidParentheses.isValidBrute("([)]") == false  ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolValidParentheses.isValidOptimal("([)]") == false ? "PASS" : "FAIL"));

        // Test 3: Unmatched openers → false
        System.out.println("Test 3 Brute  : " + (SolValidParentheses.isValidBrute("(((") == false  ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolValidParentheses.isValidOptimal("(((") == false ? "PASS" : "FAIL"));

        // Test 4: All three types valid → true
        System.out.println("Test 4 Brute  : " + (SolValidParentheses.isValidBrute("()[]{}") == true  ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolValidParentheses.isValidOptimal("()[]{}") == true ? "PASS" : "FAIL"));
    }
}