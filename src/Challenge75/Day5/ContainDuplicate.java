package Challenge75.Day5;

import java.util.HashSet;
import java.util.Set;

/*Print true if array contains duplicates*/
public class ContainDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,5,2,9,6,3,2,4,7};
        System.out.println(new SolutionContainDuplicate().IsDuplicatePresent(nums));
    }
}

class SolutionContainDuplicate{
    public boolean IsDuplicatePresent(int[] nums){
        Set<Integer> checkset = new HashSet<>();
        for (int num : nums){
            if(checkset.contains(num)){
                return true;
            }
            checkset.add(num);
        }
        return false;
    }

}


