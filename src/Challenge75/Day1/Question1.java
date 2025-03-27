package Challenge75.Day1;
/*You have given array which include negative and positive numbers in random orders
* Create functionality which keep negative numbers on left side and positive numbers on right side
* Keep zero in middle
* */
public class Question1 {
    public static void main(String[] args) {
        int[] theNumbers = {-1,8,5,-6,0,0,52,56,78,-85,-5};
        int[] resultedNum = getSplittedArray(theNumbers);
    }

    private static int[] getSplittedArray(int[] theNumbers) {
    int startIndex = 0;
    int lastIndex = theNumbers.length-1;

    while(startIndex<lastIndex){
        if(theNumbers[startIndex]>0 && theNumbers[lastIndex]<0){
            int temp = theNumbers[lastIndex];
            theNumbers[lastIndex] = theNumbers[startIndex];
            theNumbers[startIndex] = temp;
            startIndex++;
            lastIndex--;
        }else if(theNumbers[startIndex]<0){
            startIndex++;
        }else if(theNumbers[lastIndex]>0){
            lastIndex--;
        }else{
            startIndex++;
            lastIndex--;
        }
    }
    return theNumbers;
    }
}
