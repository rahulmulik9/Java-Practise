package Challenge75.Day1;

import java.util.HashSet;
import java.util.Set;

public class Contain_duplicate {
    public static void main(String[] args) {
        int[] nums = {1,8,6,7,8,4,5,7,9,4,5};
        int[] nums_1 = {1,8,6,7};

        if(findDuplicate(nums)){
            System.out.println("Duplicate Present");
        }else {
            System.out.println("Duplicate not found");
        }
    }

    private static boolean findDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        //approach first
//        for (int number:nums){
//            if(numsSet.contains(number)){
//                return true;
//            }else {
//                numsSet.add(number);
//            }
//        }
//        return false;

        //second approach
        for (int number:nums){numsSet.add(number);}
        return numsSet.size()!=nums.length;

    }
}
