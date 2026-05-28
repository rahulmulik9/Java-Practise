package Challenge75_DSA.May.Day28;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolReverseLinkedList {
    public static ListNode reverseBrute(ListNode head) {
        java.util.List<Integer> vals = new java.util.ArrayList<>();
        ListNode curr = head;
        while (curr != null) { vals.add(curr.val); curr = curr.next; }
        curr = head;
        for (int i = vals.size() - 1; i >= 0; i--) { curr.val = vals.get(i); curr = curr.next; }
        return head;
    }

    public static ListNode reverseIterative(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // helper: build list from array
    public static ListNode build(int[] arr) {
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int v : arr) { curr.next = new ListNode(v); curr = curr.next; }
        return dummy.next;
    }

    // helper: list to string for comparison
    static String str(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) { sb.append(head.val); if (head.next != null) sb.append("->"); head = head.next; }
        return sb.toString();
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Test 1: Standard 5-node list
        System.out.println("Test 1 Brute    : " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseBrute(SolReverseLinkedList.build(new int[]{1,2,3,4,5}))).equals("5->4->3->2->1")     ? "PASS" : "FAIL"));
        System.out.println("Test 1 Iterative: " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseIterative(SolReverseLinkedList.build(new int[]{1,2,3,4,5}))).equals("5->4->3->2->1") ? "PASS" : "FAIL"));
        System.out.println("Test 1 Recursive: " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseRecursive(SolReverseLinkedList.build(new int[]{1,2,3,4,5}))).equals("5->4->3->2->1") ? "PASS" : "FAIL"));

        // Test 2: Two node list
        System.out.println("Test 2 Brute    : " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseBrute(SolReverseLinkedList.build(new int[]{1,2}))).equals("2->1")     ? "PASS" : "FAIL"));
        System.out.println("Test 2 Iterative: " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseIterative(SolReverseLinkedList.build(new int[]{1,2}))).equals("2->1") ? "PASS" : "FAIL"));
        System.out.println("Test 2 Recursive: " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseRecursive(SolReverseLinkedList.build(new int[]{1,2}))).equals("2->1") ? "PASS" : "FAIL"));

        // Test 3: Single node
        System.out.println("Test 3 Brute    : " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseBrute(SolReverseLinkedList.build(new int[]{1}))).equals("1")     ? "PASS" : "FAIL"));
        System.out.println("Test 3 Iterative: " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseIterative(SolReverseLinkedList.build(new int[]{1}))).equals("1") ? "PASS" : "FAIL"));
        System.out.println("Test 3 Recursive: " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseRecursive(SolReverseLinkedList.build(new int[]{1}))).equals("1") ? "PASS" : "FAIL"));

        // Test 4: Empty list
        System.out.println("Test 4 Brute    : " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseBrute(null)).equals("")     ? "PASS" : "FAIL"));
        System.out.println("Test 4 Iterative: " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseIterative(null)).equals("") ? "PASS" : "FAIL"));
        System.out.println("Test 4 Recursive: " + (SolReverseLinkedList.str(SolReverseLinkedList.reverseRecursive(null)).equals("") ? "PASS" : "FAIL"));
    }
}