package Challenge75.Day3;
/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.*/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(new SolutionContain().maxArea(height));
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

}