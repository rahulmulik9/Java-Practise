package Challenge75_new.Day22;


import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolReverseLinkedList {

    public static ListNode reverseListBrute(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) { vals.add(curr.val); curr = curr.next; }
        curr = head;
        for (int i = vals.size() - 1; i >= 0; i--) { curr.val = vals.get(i); curr = curr.next; }
        return head;
    }

    public static ListNode reverseListOptimal(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

public class ReverseLinkedList {

    // Helper: build list from array
    static ListNode build(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) { curr.next = new ListNode(arr[i]); curr = curr.next; }
        return head;
    }

    // Helper: convert list to string
    static String listToStr(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) { sb.append(head.val); if (head.next != null) sb.append("->"); head = head.next; }
        return sb.toString();
    }

    public static void main(String[] args) {

        // Test 1: [1,2,3,4,5] → "5->4->3->2->1"
        ListNode r1b = new SolReverseLinkedList().reverseListBrute(build(new int[]{1,2,3,4,5}));
        ListNode r1o = new SolReverseLinkedList().reverseListOptimal(build(new int[]{1,2,3,4,5}));
        System.out.println("Test 1 Brute  : " + (listToStr(r1b).equals("5->4->3->2->1") ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (listToStr(r1o).equals("5->4->3->2->1") ? "PASS" : "FAIL"));

        // Test 2: [1,2] → "2->1"
        ListNode r2b = new SolReverseLinkedList().reverseListBrute(build(new int[]{1,2}));
        ListNode r2o = new SolReverseLinkedList().reverseListOptimal(build(new int[]{1,2}));
        System.out.println("Test 2 Brute  : " + (listToStr(r2b).equals("2->1") ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (listToStr(r2o).equals("2->1") ? "PASS" : "FAIL"));

        // Test 3: single node [1] → "1"
        ListNode r3b = new SolReverseLinkedList().reverseListBrute(build(new int[]{1}));
        ListNode r3o = new SolReverseLinkedList().reverseListOptimal(build(new int[]{1}));
        System.out.println("Test 3 Brute  : " + (listToStr(r3b).equals("1") ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (listToStr(r3o).equals("1") ? "PASS" : "FAIL"));

        // Test 4: empty list → ""
        ListNode r4b = new SolReverseLinkedList().reverseListBrute(build(new int[]{}));
        ListNode r4o = new SolReverseLinkedList().reverseListOptimal(build(new int[]{}));
        System.out.println("Test 4 Brute  : " + (listToStr(r4b).equals("") ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (listToStr(r4o).equals("") ? "PASS" : "FAIL"));
    }
}