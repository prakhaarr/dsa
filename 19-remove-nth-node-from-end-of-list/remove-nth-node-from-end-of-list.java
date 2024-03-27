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
 class Solution{


public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null || n <= 0) return head; // Check for edge cases

    int length = 0;
    ListNode temp = head;

    // Find the length of the linked list
    while (temp != null) {
        length++;
        temp = temp.next;
    }

    if (n > length) return head; // If n is greater than length, do nothing

    if (length == n) return head.next; // If removing the head itself

    temp = head;
    int count = 0;
    while (count < length - n - 1) {
        temp = temp.next;
        count++;
    }
    // Now temp points to the node just before the one to be removed
    temp.next = temp.next.next; // Remove the nth node

    return head;
}
}
