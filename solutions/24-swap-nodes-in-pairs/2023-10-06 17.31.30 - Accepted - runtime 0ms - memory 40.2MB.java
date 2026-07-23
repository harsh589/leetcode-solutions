class Solution {
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to simplify the code
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize three pointers: prev, current, and next
        ListNode prev = dummy;
        ListNode current = head;
        
        while (current != null && current.next != null) {
            ListNode next = current.next;
            
            // Swap current and next nodes
            current.next = next.next;
            next.next = current;
            prev.next = next;
            
            // Move prev and current to their next positions
            prev = current;
            current = current.next;
        }
        
        return dummy.next;
    }
}
