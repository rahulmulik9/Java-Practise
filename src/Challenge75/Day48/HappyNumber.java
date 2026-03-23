package Challenge75.Day48;
/*Take any number. Replace it with the sum of squares of its digits. Keep doing this. If you eventually reach 1, it's a "happy" number. If you loop forever, it's not.
Example with n = 19:

1² + 9² = 1 + 81 = 82
8² + 2² = 64 + 4 = 68
6² + 8² = 36 + 64 = 100
1² + 0² + 0² = 1 ✓ → Happy!*/

import java.util.HashSet;

public class HappyNumber {
}


class SolutionHappyNumber {

    // Helper: sum of squares of digits
    private int sumOfSquares(int n) {
        int total = 0;
        while (n > 0) {
            int digit = n % 10;   // get last digit
            total += digit * digit;   // square it and add
            n = n / 10;            // remove last digit
        }
        return total;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;  // we've seen this before → cycle!
            }
            seen.add(n);       // mark as seen
            n = sumOfSquares(n);
        }

        return true;  // reached 1 → happy!
    }
}