package Challenge75.Day32;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] intary= {0,5,6,0,4,8,0,6,7};
        Arrays.stream(new MoveZeroSol().MoveZeros(intary)).forEach(System.out::println);
    }
}

class MoveZeroSol{
    public int[] MoveZeros(int [] input){

        return  new int[]{};
    }
}