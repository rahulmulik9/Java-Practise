package Challenge75.Day32;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] intary = {0, 5, 6, 0, 4, 8, 0, 6, 7};
        int[] intary1= {0};
        int[] intary2= {1,3,5,6};
        Arrays.stream(new MoveZeroSol().MoveZeros(intary)).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(new MoveZeroSol().MoveZeros(intary1)).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(new MoveZeroSol().MoveZeros(intary2)).forEach(System.out::print);
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