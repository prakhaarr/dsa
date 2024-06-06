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

        k = k % len;
        if (k == 0) {
            return head; 
        }

        
        ListNode tail = head;
        for(int i = 0; i < len - k - 1; i++) {
            tail = tail.next;
        }

        ListNode newHead = tail.next;
        tail.next = null;

        ListNode oldTail = newHead;
        while(oldTail.next != null) {
            oldTail = oldTail.next;
        }
        oldTail.next = head;

        return newHead;
    }
}
