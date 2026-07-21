package Challenge75_DSA.July.Day21;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class ReverseLinkedList {
}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;  // save next before breaking link
            curr.next = prev;           // reverse the link
            prev = curr;                // move prev forward
            curr = next;                // move curr forward
        }
        return prev;
    }
}