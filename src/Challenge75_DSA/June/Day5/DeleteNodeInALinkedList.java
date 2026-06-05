package Challenge75_DSA.June.Day5;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolDeleteNodeInALinkedList {

    public static void deleteNodeBrute(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void deleteNodeOptimal(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
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

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {

        // Test 1: Delete node(3) from [1,2,3,4,5] → [1,2,4,5]
        ListNode t1 = SolDeleteNodeInALinkedList.build(new int[]{1, 2, 3, 4, 5});
        ListNode t1Target = t1.next.next; // node(3)
        SolDeleteNodeInALinkedList.deleteNodeBrute(t1Target);
        System.out.println("Test 1 Brute  : " + (SolDeleteNodeInALinkedList.listToString(t1).equals("1→2→4→5") ? "PASS" : "FAIL"));

        ListNode t1b = SolDeleteNodeInALinkedList.build(new int[]{1, 2, 3, 4, 5});
        ListNode t1bTarget = t1b.next.next; // node(3)
        SolDeleteNodeInALinkedList.deleteNodeOptimal(t1bTarget);
        System.out.println("Test 1 Optimal: " + (SolDeleteNodeInALinkedList.listToString(t1b).equals("1→2→4→5") ? "PASS" : "FAIL"));

        // Test 2: Delete head node(1) from [1,2,3] → [2,3]
        ListNode t2 = SolDeleteNodeInALinkedList.build(new int[]{1, 2, 3});
        SolDeleteNodeInALinkedList.deleteNodeBrute(t2); // t2 itself is the head node
        System.out.println("Test 2 Brute  : " + (SolDeleteNodeInALinkedList.listToString(t2).equals("2→3") ? "PASS" : "FAIL"));

        ListNode t2b = SolDeleteNodeInALinkedList.build(new int[]{1, 2, 3});
        SolDeleteNodeInALinkedList.deleteNodeOptimal(t2b);
        System.out.println("Test 2 Optimal: " + (SolDeleteNodeInALinkedList.listToString(t2b).equals("2→3") ? "PASS" : "FAIL"));

        // Test 3: Delete node(5) from [4,5,9] → [4,9]
        ListNode t3 = SolDeleteNodeInALinkedList.build(new int[]{4, 5, 9});
        ListNode t3Target = t3.next; // node(5)
        SolDeleteNodeInALinkedList.deleteNodeBrute(t3Target);
        System.out.println("Test 3 Brute  : " + (SolDeleteNodeInALinkedList.listToString(t3).equals("4→9") ? "PASS" : "FAIL"));

        ListNode t3b = SolDeleteNodeInALinkedList.build(new int[]{4, 5, 9});
        ListNode t3bTarget = t3b.next; // node(5)
        SolDeleteNodeInALinkedList.deleteNodeOptimal(t3bTarget);
        System.out.println("Test 3 Optimal: " + (SolDeleteNodeInALinkedList.listToString(t3b).equals("4→9") ? "PASS" : "FAIL"));

        // Test 4: Delete node(2) from [1,2,4] → [1,4]
        ListNode t4 = SolDeleteNodeInALinkedList.build(new int[]{1, 2, 4});
        ListNode t4Target = t4.next; // node(2)
        SolDeleteNodeInALinkedList.deleteNodeBrute(t4Target);
        System.out.println("Test 4 Brute  : " + (SolDeleteNodeInALinkedList.listToString(t4).equals("1→4") ? "PASS" : "FAIL"));

        ListNode t4b = SolDeleteNodeInALinkedList.build(new int[]{1, 2, 4});
        ListNode t4bTarget = t4b.next; // node(2)
        SolDeleteNodeInALinkedList.deleteNodeOptimal(t4bTarget);
        System.out.println("Test 4 Optimal: " + (SolDeleteNodeInALinkedList.listToString(t4b).equals("1→4") ? "PASS" : "FAIL"));
    }
}