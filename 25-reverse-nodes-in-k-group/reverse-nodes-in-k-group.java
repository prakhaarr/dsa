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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front = null;
        int count = 0;

        // First, check if there are at least k nodes left to reverse
        ListNode check = head;
        for (int i = 0; i < k; i++) {
            if (check == null){
                return head;
            }
            check = check.next;
        }

        // Reverse k nodes
        while (temp != null && count < k) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
            count++;
        }

        // Recursively call reverseKGroup for the next segment
        if (front != null) {
            head.next = reverseKGroup(front, k);
        }

        return prev;
    }
}
