package Challenge75.Day32;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arryFirst = {0, 5, 6, 0, 4, 8, 0, 6, 7};
        int[] arrySecond= {0};
        int[] arryThird= {1,3,5,6};
        Arrays.stream(new MoveZeroSol().MoveZeros(arryFirst)).forEach(System.out::print);
        Arrays.stream(new MoveZeroSol().MoveZeros(arrySecond)).forEach(System.out::print);
        Arrays.stream(new MoveZeroSol().MoveZeros(arryThird)).forEach(System.out::print);
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