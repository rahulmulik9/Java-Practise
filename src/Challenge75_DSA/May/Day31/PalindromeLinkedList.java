package Challenge75_DSA.May.Day31;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class SolPalindromeLinkedList {
    public static boolean isPalindromeBrute(ListNode head) {
        java.util.List<Integer> vals = new java.util.ArrayList<>();
        ListNode curr = head;
        while (curr != null) { vals.add(curr.val); curr = curr.next; }
        int left = 0, right = vals.size() - 1;
        while (left < right) {
            if (!vals.get(left).equals(vals.get(right))) return false;
            left++; right--;
        }
        return true;
    }

    public static boolean isPalindromeOptimal(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow);
        ListNode copy = secondHalf;
        ListNode first = head;
        boolean result = true;
        while (secondHalf != null) {
            if (first.val != secondHalf.val) { result = false; break; }
            first = first.next;
            secondHalf = secondHalf.next;
        }
        reverse(copy);
        return result;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static ListNode build(int[] arr) {
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int v : arr) { curr.next = new ListNode(v); curr = curr.next; }
        return dummy.next;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        // Test 1: Even length palindrome
        System.out.println("Test 1 Brute  : " + (new SolPalindromeLinkedList().isPalindromeBrute(SolPalindromeLinkedList.build(new int[]{1,2,2,1}))   ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolPalindromeLinkedList().isPalindromeOptimal(SolPalindromeLinkedList.build(new int[]{1,2,2,1}))  ? "PASS" : "FAIL"));

        // Test 2: Odd length palindrome
        System.out.println("Test 2 Brute  : " + (new SolPalindromeLinkedList().isPalindromeBrute(SolPalindromeLinkedList.build(new int[]{1,2,1}))   ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolPalindromeLinkedList().isPalindromeOptimal(SolPalindromeLinkedList.build(new int[]{1,2,1}))  ? "PASS" : "FAIL"));

        // Test 3: Not a palindrome
        System.out.println("Test 3 Brute  : " + (!new SolPalindromeLinkedList().isPalindromeBrute(SolPalindromeLinkedList.build(new int[]{1,2,3}))  ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (!new SolPalindromeLinkedList().isPalindromeOptimal(SolPalindromeLinkedList.build(new int[]{1,2,3})) ? "PASS" : "FAIL"));

        // Test 4: Single node — always palindrome
        System.out.println("Test 4 Brute  : " + (new SolPalindromeLinkedList().isPalindromeBrute(SolPalindromeLinkedList.build(new int[]{7}))   ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolPalindromeLinkedList().isPalindromeOptimal(SolPalindromeLinkedList.build(new int[]{7}))  ? "PASS" : "FAIL"));
    }
}