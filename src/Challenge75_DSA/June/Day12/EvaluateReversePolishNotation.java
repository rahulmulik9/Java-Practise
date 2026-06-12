package Challenge75_DSA.June.Day12;
//git username changes
class SolEvaluateReversePolishNotation {

    public static int evalRPNBrute(String[] tokens) {
        java.util.List<String> list = new java.util.ArrayList<>(java.util.Arrays.asList(tokens));
        while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                String t = list.get(i);
                if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                    int b = Integer.parseInt(list.get(i - 2));
                    int a = Integer.parseInt(list.get(i - 1));
                    int res;
                    switch (t) {
                        case "+": res = b + a; break;
                        case "-": res = b - a; break;
                        case "*": res = b * a; break;
                        default:  res = b / a; break;
                    }
                    list.set(i - 2, String.valueOf(res));
                    list.remove(i - 1);
                    list.remove(i - 1);
                    break;
                }
            }
        }
        return Integer.parseInt(list.get(0));
    }

    public static int evalRPNOptimal(String[] tokens) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {

        // Test 1: ["2","1","+","3","*"] → 9
        System.out.println("Test 1 Brute  : " + (SolEvaluateReversePolishNotation.evalRPNBrute(new String[]{"2","1","+","3","*"})   == 9 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolEvaluateReversePolishNotation.evalRPNOptimal(new String[]{"2","1","+","3","*"}) == 9 ? "PASS" : "FAIL"));

        // Test 2: ["4","13","5","/","+"] → 6
        System.out.println("Test 2 Brute  : " + (SolEvaluateReversePolishNotation.evalRPNBrute(new String[]{"4","13","5","/","+"})   == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolEvaluateReversePolishNotation.evalRPNOptimal(new String[]{"4","13","5","/","+"}) == 6 ? "PASS" : "FAIL"));

        // Test 3: Negative number → ["10","6","9","3","+","-11","*","/","*","17","+","5","+"] → 22
        System.out.println("Test 3 Brute  : " + (SolEvaluateReversePolishNotation.evalRPNBrute(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"})   == 22 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolEvaluateReversePolishNotation.evalRPNOptimal(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}) == 22 ? "PASS" : "FAIL"));

        // Test 4: Single number → ["42"] → 42
        System.out.println("Test 4 Brute  : " + (SolEvaluateReversePolishNotation.evalRPNBrute(new String[]{"42"})   == 42 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolEvaluateReversePolishNotation.evalRPNOptimal(new String[]{"42"}) == 42 ? "PASS" : "FAIL"));
    }
}