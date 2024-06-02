/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> mp = new HashSet<>();
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        
        while (temp1 != null) {
            mp.add(temp1);
            temp1 = temp1.next;
        }


        while (temp2 != null) {
            if (mp.contains(temp2)) {
                return temp2;
            }
            mp.add(temp2);
            temp2 = temp2.next;
        }

    
        return null;
    }
}