import java.util.*;

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Traverse the linked list to extract values into an ArrayList
        ListNode temp = head;
        List<Integer> values = new ArrayList<>();
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }
        
        // Sort the ArrayList
        Collections.sort(values);

        // Reconstruct the sorted linked list
        ListNode result = new ListNode(-1);
        ListNode current = result;
        for (int i =0;i<values.size();i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }

        return result.next;
    }
}
