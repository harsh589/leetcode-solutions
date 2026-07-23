class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                int duplicateValue = current.next.val;
                while (current.next != null && current.next.val == duplicateValue) {
                    current.next = current.next.next;
                }
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
