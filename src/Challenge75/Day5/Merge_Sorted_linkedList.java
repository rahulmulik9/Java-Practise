package Challenge75.Day5;
/**
 * Definition for singly-linked list. */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class Merge_Sorted_linkedList {
    // Utility method to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // List 1: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(5)));

        // List 2: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2,
                new ListNode(4,
                        new ListNode(6)));

        System.out.print("List 1: ");
        printList(l1);

        System.out.print("List 2: ");
        printList(l2);

        // Merge lists
        ListNode merged = mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}

