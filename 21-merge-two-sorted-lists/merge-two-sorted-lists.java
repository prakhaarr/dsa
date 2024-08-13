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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        List<Integer> ls = new ArrayList<>();

        while(temp1!= null){
            ls.add(temp1.val);
            temp1 = temp1.next;
        }

        while(temp2!= null){
            ls.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(ls);

        ListNode result = new ListNode(-1);
        ListNode temp = result;

        for (int i = 0; i < ls.size(); i++) {
            result.next = new ListNode(ls.get(i));
            result = result.next;
        }
        return temp.next;


    }
}