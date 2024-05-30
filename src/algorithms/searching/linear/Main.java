package algorithms.searching.linear;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,8,9,4,5,6,87,15,36,45,85,96,45,23,21};
        int toFind = 85;
        if(findNumIndex(nums,toFind) == -1){
            System.out.println("Value not found");
        }else {
            System.out.println("Value found at : "+findNumIndex(nums,toFind));
        }


    }
    public static int findNumIndex(int[] nums, int toFind){
        int index =-1;
        if(nums.length==0){
            return index;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==toFind){
                index = nums[i];
            }
        }
        return index;
    }
}
