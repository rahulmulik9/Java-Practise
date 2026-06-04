package Challenge75_DSA.June.Day4;


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolRemoveLinkedListElements {

    public static ListNode removeElementsBrute(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }

    public static ListNode removeElementsOptimal(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return dummy.next;
    }

    static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) { sb.append(head.val).append(head.next != null ? "→" : ""); head = head.next; }
        return sb.toString();
    }

    static ListNode build(int[] arr) {
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int v : arr) { curr.next = new ListNode(v); curr = curr.next; }
        return dummy.next;
    }
}

public class RemoveLinkedListElements {
    public static void main(String[] args) {

        // Test 1: Remove all 6s from middle and end → [1,2,3,4,5]
        System.out.println("Test 1 Brute  : " + (SolRemoveLinkedListElements.listToString(SolRemoveLinkedListElements.removeElementsBrute(SolRemoveLinkedListElements.build(new int[]{1,2,6,3,4,5,6}), 6)).equals("1→2→3→4→5") ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolRemoveLinkedListElements.listToString(SolRemoveLinkedListElements.removeElementsOptimal(SolRemoveLinkedListElements.build(new int[]{1,2,6,3,4,5,6}), 6)).equals("1→2→3→4→5") ? "PASS" : "FAIL"));

        // Test 2: All nodes match val → empty list
        System.out.println("Test 2 Brute  : " + (SolRemoveLinkedListElements.listToString(SolRemoveLinkedListElements.removeElementsBrute(SolRemoveLinkedListElements.build(new int[]{7,7,7,7}), 7)).equals("") ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolRemoveLinkedListElements.listToString(SolRemoveLinkedListElements.removeElementsOptimal(SolRemoveLinkedListElements.build(new int[]{7,7,7,7}), 7)).equals("") ? "PASS" : "FAIL"));

        // Test 3: No nodes match val → list unchanged
        System.out.println("Test 3 Brute  : " + (SolRemoveLinkedListElements.listToString(SolRemoveLinkedListElements.removeElementsBrute(SolRemoveLinkedListElements.build(new int[]{1,2,3}), 9)).equals("1→2→3") ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolRemoveLinkedListElements.listToString(SolRemoveLinkedListElements.removeElementsOptimal(SolRemoveLinkedListElements.build(new int[]{1,2,3}), 9)).equals("1→2→3") ? "PASS" : "FAIL"));

        // Test 4: Consecutive duplicates at head → [3,4]
        System.out.println("Test 4 Brute  : " + (SolRemoveLinkedListElements.listToString(SolRemoveLinkedListElements.removeElementsBrute(SolRemoveLinkedListElements.build(new int[]{2,2,3,4}), 2)).equals("3→4") ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolRemoveLinkedListElements.listToString(SolRemoveLinkedListElements.removeElementsOptimal(SolRemoveLinkedListElements.build(new int[]{2,2,3,4}), 2)).equals("3→4") ? "PASS" : "FAIL"));
    }
}