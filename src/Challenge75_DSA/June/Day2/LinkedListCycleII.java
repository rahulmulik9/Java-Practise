package Challenge75_DSA.June.Day2;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolLinkedListCycleII {

    public static ListNode detectCycleBrute(ListNode head) {
        java.util.Set<ListNode> seen = new java.util.HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (!seen.add(curr)) return curr;
            curr = curr.next;
        }
        return null;
    }

    public static ListNode detectCycleOptimal(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

public class LinkedListCycleII {
    public static void main(String[] args) {

        // Test 1: Cycle at index 1 → node(2) is cycle start
        ListNode t1n1 = new ListNode(3), t1n2 = new ListNode(2),
                t1n3 = new ListNode(0), t1n4 = new ListNode(-4);
        t1n1.next = t1n2; t1n2.next = t1n3; t1n3.next = t1n4; t1n4.next = t1n2;
        System.out.println("Test 1 Brute  : " + (SolLinkedListCycleII.detectCycleBrute(t1n1)   == t1n2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolLinkedListCycleII.detectCycleOptimal(t1n1) == t1n2 ? "PASS" : "FAIL"));

        // Test 2: Cycle at head (index 0) → node(1) is cycle start
        ListNode t2n1 = new ListNode(1), t2n2 = new ListNode(2);
        t2n1.next = t2n2; t2n2.next = t2n1;
        System.out.println("Test 2 Brute  : " + (SolLinkedListCycleII.detectCycleBrute(t2n1)   == t2n1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolLinkedListCycleII.detectCycleOptimal(t2n1) == t2n1 ? "PASS" : "FAIL"));

        // Test 3: No cycle → expect null
        ListNode t3n1 = new ListNode(1), t3n2 = new ListNode(2), t3n3 = new ListNode(3);
        t3n1.next = t3n2; t3n2.next = t3n3;
        System.out.println("Test 3 Brute  : " + (SolLinkedListCycleII.detectCycleBrute(t3n1)   == null ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolLinkedListCycleII.detectCycleOptimal(t3n1) == null ? "PASS" : "FAIL"));

        // Test 4: Single node, no cycle → expect null
        ListNode t4n1 = new ListNode(1);
        System.out.println("Test 4 Brute  : " + (SolLinkedListCycleII.detectCycleBrute(t4n1)   == null ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolLinkedListCycleII.detectCycleOptimal(t4n1) == null ? "PASS" : "FAIL"));
    }
}