/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a list with a single node is always a palindrome.
        }

        // Step 1: Find the middle of the linked list.
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list.
        ListNode secondHalf = reverseLinkedList(slow);

        // Step 3: Compare the first half with the reversed second half.
        while (secondHalf != null) {
            if (head.val != secondHalf.val) {
                return false; // If values don't match, it's not a palindrome.
            }
            head = head.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Helper function to reverse a linked list.
    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}
