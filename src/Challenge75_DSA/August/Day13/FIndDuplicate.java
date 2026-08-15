package Challenge75_DSA.August.Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FIndDuplicate {
}

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[nums[0]];
        int fast = nums[nums[nums[0]]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    Function<String, String> myFunction = (s)->s.toUpperCase();

    String toUpperCaseMySelf(String s){
        return s.toUpperCase();
    }

    void toTheStuff(){
        String randomName = "asdfasd";
        String getUpperByFunction = myFunction.apply(randomName);
        String getUpperByMethod = toUpperCaseMySelf(randomName);

        List<String> mylist = List.of(new String[]{"asdf", "asdfasd", "asdfsdfg", "wert"});
        List<String> resulted =mylist.stream().map(s -> toUpperCaseMySelf(s)).toList();
        List<String> resulted2 =mylist.stream().map(s -> myFunction.apply(s)).toList();
    }


}