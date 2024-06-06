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

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null) {
            return head;
        }

        // Find the length of the list
        ListNode counter = head;
        int len = 0;

        while(counter != null) {
            counter = counter.next;
            len++;
        }

        // Find the effective rotations needed
        k = k % len;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Find the new tail (len - k - 1) and the new head (len - k)
        ListNode tail = head;
        for(int i = 0; i < len - k - 1; i++) {
            tail = tail.next;
        }

        // Set the new head and adjust the pointers
        ListNode newHead = tail.next;
        tail.next = null;

        // Find the old tail and connect it to the original head
        ListNode oldTail = newHead;
        while(oldTail.next != null) {
            oldTail = oldTail.next;
        }
        oldTail.next = head;

        return newHead;
    }
}
