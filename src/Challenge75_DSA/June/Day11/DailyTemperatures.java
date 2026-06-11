package Challenge75_DSA.June.Day11;


class SolDailyTemperatures {

    public static int[] dailyTemperaturesBrute(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (temperatures[j] > temperatures[i]) { result[i] = j - i; break; }
        return result;
    }

    public static int[] dailyTemperaturesOptimal(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }
}

public class DailyTemperatures {
    public static void main(String[] args) {

        // Test 1: Classic mixed case → [1,1,4,2,1,1,0,0]
        System.out.println("Test 1 Brute  : " + (java.util.Arrays.equals(SolDailyTemperatures.dailyTemperaturesBrute(new int[]{73,74,75,71,69,72,76,73}),  new int[]{1,1,4,2,1,1,0,0}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (java.util.Arrays.equals(SolDailyTemperatures.dailyTemperaturesOptimal(new int[]{73,74,75,71,69,72,76,73}), new int[]{1,1,4,2,1,1,0,0}) ? "PASS" : "FAIL"));

        // Test 2: Strictly decreasing → all zeros [0,0,0]
        System.out.println("Test 2 Brute  : " + (java.util.Arrays.equals(SolDailyTemperatures.dailyTemperaturesBrute(new int[]{90, 80, 70}),  new int[]{0,0,0}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (java.util.Arrays.equals(SolDailyTemperatures.dailyTemperaturesOptimal(new int[]{90, 80, 70}), new int[]{0,0,0}) ? "PASS" : "FAIL"));

        // Test 3: Strictly increasing → each waits 1 day [1,1,1,0]
        System.out.println("Test 3 Brute  : " + (java.util.Arrays.equals(SolDailyTemperatures.dailyTemperaturesBrute(new int[]{70, 71, 72, 73}),  new int[]{1,1,1,0}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (java.util.Arrays.equals(SolDailyTemperatures.dailyTemperaturesOptimal(new int[]{70, 71, 72, 73}), new int[]{1,1,1,0}) ? "PASS" : "FAIL"));

        // Test 4: Single element → [0]
        System.out.println("Test 4 Brute  : " + (java.util.Arrays.equals(SolDailyTemperatures.dailyTemperaturesBrute(new int[]{55}),  new int[]{0}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (java.util.Arrays.equals(SolDailyTemperatures.dailyTemperaturesOptimal(new int[]{55}), new int[]{0}) ? "PASS" : "FAIL"));
    }
}
