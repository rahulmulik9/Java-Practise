package Challenge75_DSA.June.Day3;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolRemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEndBrute(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) { length++; curr = curr.next; }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        curr = dummy;
        for (int i = 0; i < length - n; i++) curr = curr.next;
        curr.next = curr.next.next;
        return dummy.next;
    }

    public static ListNode removeNthFromEndOptimal(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        for (int i = 0; i <= n; i++) fast = fast.next;
        while (fast != null) { slow = slow.next; fast = fast.next; }
        slow.next = slow.next.next;
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

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {

        // Test 1: Remove 2nd from end → remove node(4) from [1,2,3,4,5] → [1,2,3,5]
        System.out.println("Test 1 Brute  : " + (SolRemoveNthNodeFromEndOfList.listToString(SolRemoveNthNodeFromEndOfList.removeNthFromEndBrute(SolRemoveNthNodeFromEndOfList.build(new int[]{1,2,3,4,5}), 2)).equals("1→2→3→5") ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolRemoveNthNodeFromEndOfList.listToString(SolRemoveNthNodeFromEndOfList.removeNthFromEndOptimal(SolRemoveNthNodeFromEndOfList.build(new int[]{1,2,3,4,5}), 2)).equals("1→2→3→5") ? "PASS" : "FAIL"));

        // Test 2: Remove head (n == length) → remove node(1) from [1,2] → [2]
        System.out.println("Test 2 Brute  : " + (SolRemoveNthNodeFromEndOfList.listToString(SolRemoveNthNodeFromEndOfList.removeNthFromEndBrute(SolRemoveNthNodeFromEndOfList.build(new int[]{1,2}), 2)).equals("2") ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolRemoveNthNodeFromEndOfList.listToString(SolRemoveNthNodeFromEndOfList.removeNthFromEndOptimal(SolRemoveNthNodeFromEndOfList.build(new int[]{1,2}), 2)).equals("2") ? "PASS" : "FAIL"));

        // Test 3: Single node → remove only node → []
        System.out.println("Test 3 Brute  : " + (SolRemoveNthNodeFromEndOfList.listToString(SolRemoveNthNodeFromEndOfList.removeNthFromEndBrute(SolRemoveNthNodeFromEndOfList.build(new int[]{1}), 1)).equals("") ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolRemoveNthNodeFromEndOfList.listToString(SolRemoveNthNodeFromEndOfList.removeNthFromEndOptimal(SolRemoveNthNodeFromEndOfList.build(new int[]{1}), 1)).equals("") ? "PASS" : "FAIL"));

        // Test 4: Remove last node (n=1) → remove node(5) from [1,2,3,4,5] → [1,2,3,4]
        System.out.println("Test 4 Brute  : " + (SolRemoveNthNodeFromEndOfList.listToString(SolRemoveNthNodeFromEndOfList.removeNthFromEndBrute(SolRemoveNthNodeFromEndOfList.build(new int[]{1,2,3,4,5}), 1)).equals("1→2→3→4") ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolRemoveNthNodeFromEndOfList.listToString(SolRemoveNthNodeFromEndOfList.removeNthFromEndOptimal(SolRemoveNthNodeFromEndOfList.build(new int[]{1,2,3,4,5}), 1)).equals("1→2→3→4") ? "PASS" : "FAIL"));
    }
}