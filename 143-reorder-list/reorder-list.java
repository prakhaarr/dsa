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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode newHead = reverse(head.next);
        ListNode nextHead = head.next;
        nextHead.next = head;
        head.next = null;

        return newHead;
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(l1!=null && l2!=null){
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }


        if(l1!=null){
            temp.next = l1;
        }
        else{
        temp.next = l2;
        }
      
    return dummy.next;
    }

    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(slow.next);

        slow.next = null;

        ListNode mergedList = merge(head,newHead);

        head = mergedList;

        
    }
}