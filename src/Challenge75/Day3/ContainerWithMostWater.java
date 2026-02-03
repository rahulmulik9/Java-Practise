package Challenge75.Day3;

import java.util.List;
import java.util.stream.Collectors;

/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.*/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(new SolutionContain().maxArea(height));
        new SolutionContain().wordsCharArr();
    }
}

class SolutionContain{
    public  int maxArea(int [] heights){
        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;

        while(left<right){
            int h = Math.min(heights[left],heights[right]);
            int w = right-left;
            int area = h*w;
            maxArea =Math.max(maxArea,area);

            if(heights[left]>heights[right]){
                right--;
            }else {
                left++;
            }

        }
        return maxArea;
    }

    public void wordsCharArr(){

        List<String> stringList = List.of("INDIA","COUNTRY");

        List<Character> charList = stringList.stream().
                flatMap(word->word.chars().mapToObj(c->(char)c)).toList();
        stringList.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .forEach(System.out::print);

    }
}