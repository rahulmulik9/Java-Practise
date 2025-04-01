package Challenge75.Day2;
//check given sun can be using given array.


import java.util.Arrays;
import java.util.HashSet;

public class Question1 {
    public static void main(String[] args) {
        int[] theNumbers = {2,5,9,7,-5,-3,-4,7,3,4};
       // System.out.println(checkGivenSumISPossible(theNumbers,7));
        System.out.println(checkGivenSumISPossibleDecond(theNumbers,7));
    }

    private static boolean checkGivenSumISPossibleDecond(int[] theNumbers, int i) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int n : theNumbers) {
            if (numbers.contains(i - n)) {
                return true;
            } else {
                numbers.add(n);
            }
        }
        return false;
    }

    private static boolean checkGivenSumISPossible(int[] theNumbers, int sum) {

        for (int i = 0; i < theNumbers.length; i++) {
            for (int j = 1; j < theNumbers.length; j++) {
                if (theNumbers[i] + theNumbers[j] == sum)
                    return true;
            }
        }

        return false;
    }
}
