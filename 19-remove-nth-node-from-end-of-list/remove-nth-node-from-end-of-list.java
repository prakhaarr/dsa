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
    if(head.next == null && n==1){
        return null;
    }
    if(head ==null || head.next == null){
        return head;
    }
    
    
    ListNode temp =head;
    int count =0;

    while(temp!=null){
        count++;
        temp = temp.next;
    }
    if (count == n) return head.next;
    ListNode move = head;

    for(int i =1;i<count-n;i++){
        move = move.next;
    }

    if(n==1){
        move.next = null;
    }
    else{
        move.next = move.next.next;
    }
    //System.out.println(count);

    


    return head;


}
}
