package Challenge75.Day11;


public class RemoveDuplicateLinkedList {
    public static void main(String[] args) {
        ListNode list5 = new ListNode(5,null);
        ListNode list4 = new ListNode(4,list5);
        ListNode list3 = new ListNode(3,list4);
        ListNode list33 = new ListNode(3,list3);
        ListNode list2 = new ListNode(2,list33);
        ListNode list1 = new ListNode(1,list2);
        ListNode currentNode = new SolutionRemovedLinkesList().deleteDuplicates(list1);
        while(currentNode.next != null){
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }


}

/**
 * Definition for singly-linked list. */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class SolutionRemovedLinkesList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val)
                curr.next = curr.next.next;
            curr = curr.next;
        }

        return head;
    }
}
