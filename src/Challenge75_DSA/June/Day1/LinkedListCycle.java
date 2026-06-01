package Challenge75_DSA.June.Day1;


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolLinkedListCycle {
    public static boolean hasCycleBrute(ListNode head) {
        java.util.Set<ListNode> seen = new java.util.HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (!seen.add(curr)) return true;
            curr = curr.next;
        }
        return false;
    }

    public static boolean hasCycleOptimal(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // helper: build list with cycle at position cyclePos (-1 = no cycle)
    static ListNode build(int[] arr, int cyclePos) {
        ListNode dummy = new ListNode(0), curr = dummy;
        ListNode cycleEntry = null;
        for (int i = 0; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
            if (i == cyclePos) cycleEntry = curr;
        }
        if (cycleEntry != null) curr.next = cycleEntry;
        return dummy.next;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        // Test 1: Cycle exists — tail connects to index 1
        System.out.println("Test 1 Brute  : " + (new SolLinkedListCycle().hasCycleBrute(SolLinkedListCycle.build(new int[]{3,2,0,-4}, 1))   ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolLinkedListCycle().hasCycleOptimal(SolLinkedListCycle.build(new int[]{3,2,0,-4}, 1))  ? "PASS" : "FAIL"));

        // Test 2: Cycle at head — tail connects to index 0
        System.out.println("Test 2 Brute  : " + (new SolLinkedListCycle().hasCycleBrute(SolLinkedListCycle.build(new int[]{1,2}, 0))   ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolLinkedListCycle().hasCycleOptimal(SolLinkedListCycle.build(new int[]{1,2}, 0))  ? "PASS" : "FAIL"));

        // Test 3: No cycle
        System.out.println("Test 3 Brute  : " + (!new SolLinkedListCycle().hasCycleBrute(SolLinkedListCycle.build(new int[]{1,2,3}, -1))  ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (!new SolLinkedListCycle().hasCycleOptimal(SolLinkedListCycle.build(new int[]{1,2,3}, -1)) ? "PASS" : "FAIL"));

        // Test 4: Single node no cycle
        System.out.println("Test 4 Brute  : " + (!new SolLinkedListCycle().hasCycleBrute(SolLinkedListCycle.build(new int[]{1}, -1))  ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (!new SolLinkedListCycle().hasCycleOptimal(SolLinkedListCycle.build(new int[]{1}, -1)) ? "PASS" : "FAIL"));
    }
}