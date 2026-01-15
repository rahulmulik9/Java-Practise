package Challenge75.Day10;

public class Plus_One {
}

class SolutionPlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // All digits were 9, create a new array
        int[] result = new int[n + 1];
        result[0] = 1; // rest are already 0
        return result;
    }
}
