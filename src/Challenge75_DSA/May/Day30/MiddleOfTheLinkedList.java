package Challenge75_DSA.May.Day30;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolMiddleOfTheLinkedList {
    public static ListNode middleBrute(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) { count++; curr = curr.next; }
        curr = head;
        for (int i = 0; i < count / 2; i++) curr = curr.next;
        return curr;
    }

    public static ListNode middleOptimal(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // helper: build list from array
    static ListNode build(int[] arr) {
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int v : arr) { curr.next = new ListNode(v); curr = curr.next; }
        return dummy.next;
    }

    // helper: list to string
    static String str(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) { sb.append(head.val); if (head.next != null) sb.append("->"); head = head.next; }
        return sb.toString();
    }
}

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        // Test 1: Odd length — single middle
        System.out.println("Test 1 Brute  : " + (SolMiddleOfTheLinkedList.str(SolMiddleOfTheLinkedList.middleBrute(SolMiddleOfTheLinkedList.build(new int[]{1,2,3,4,5}))).equals("3->4->5")  ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolMiddleOfTheLinkedList.str(SolMiddleOfTheLinkedList.middleOptimal(SolMiddleOfTheLinkedList.build(new int[]{1,2,3,4,5}))).equals("3->4->5") ? "PASS" : "FAIL"));

        // Test 2: Even length — second middle returned
        System.out.println("Test 2 Brute  : " + (SolMiddleOfTheLinkedList.str(SolMiddleOfTheLinkedList.middleBrute(SolMiddleOfTheLinkedList.build(new int[]{1,2,3,4}))).equals("3->4")  ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolMiddleOfTheLinkedList.str(SolMiddleOfTheLinkedList.middleOptimal(SolMiddleOfTheLinkedList.build(new int[]{1,2,3,4}))).equals("3->4") ? "PASS" : "FAIL"));

        // Test 3: Two node list — second node is middle
        System.out.println("Test 3 Brute  : " + (SolMiddleOfTheLinkedList.str(SolMiddleOfTheLinkedList.middleBrute(SolMiddleOfTheLinkedList.build(new int[]{1,2}))).equals("2")  ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolMiddleOfTheLinkedList.str(SolMiddleOfTheLinkedList.middleOptimal(SolMiddleOfTheLinkedList.build(new int[]{1,2}))).equals("2") ? "PASS" : "FAIL"));

        // Test 4: Single node
        System.out.println("Test 4 Brute  : " + (SolMiddleOfTheLinkedList.str(SolMiddleOfTheLinkedList.middleBrute(SolMiddleOfTheLinkedList.build(new int[]{42}))).equals("42")  ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolMiddleOfTheLinkedList.str(SolMiddleOfTheLinkedList.middleOptimal(SolMiddleOfTheLinkedList.build(new int[]{42}))).equals("42") ? "PASS" : "FAIL"));
    }
}
