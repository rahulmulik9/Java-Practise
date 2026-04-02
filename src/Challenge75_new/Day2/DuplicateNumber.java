package Challenge75_new.Day2;
class SolDuplicateNumber{

    public int findDuplicate(int[] nums) {

        // Phase 1: Find the intersection point inside the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];         // moves 1 step
            fast = nums[nums[fast]];   // moves 2 steps
        } while (slow != fast);

        // Phase 2: Find the entrance of the cycle (= duplicate number)
        slow = nums[0];  // reset slow to start

        while (slow != fast) {
            slow = nums[slow];   // both move 1 step now
            fast = nums[fast];
        }

        return slow; // where they meet = duplicate
    }
}
public class DuplicateNumber {
}
