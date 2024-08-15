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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null) return null;
        ListNode temp = head;
        int count =0;

        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(n==count) return head.next;

        ListNode travel = head;
        int num =1;
        for(int i=1;i<count-n;i++){
            travel = travel.next;
        }
        
        travel.next=travel.next.next;

        return head;

    }
}