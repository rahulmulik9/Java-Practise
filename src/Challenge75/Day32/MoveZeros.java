package Challenge75.Day32;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] intary = {0, 5, 6, 0, 4, 8, 0, 6, 7};
        Arrays.stream(new MoveZeroSol().MoveZeros(intary)).forEach(System.out::print);
    }
}

class MoveZeroSol {
    public int[] MoveZeros(int[] input) {
        int currentIndex = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i]!= 0){
                input[currentIndex] = input[i];
                currentIndex++;
            }
        }

        while(currentIndex<input.length){
            input[currentIndex] = 0;
            currentIndex++;
        }
        return input;
    }
}