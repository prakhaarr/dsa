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
 // class Solution {
//     public int[] nodesBetweenCriticalPoints(ListNode head) {
//         ListNode temp = head;
//         if(temp.next.next == null){
//             int[] emp = new int[2];
//             emp[0]= -1;
//             emp[1] = -1;
//             return emp;
//         }
//         int count =1;
//         ListNode curr = head.next;
//         ListNode prev = head;
//         List<Integer> ls = new ArrayList<>();
//         //prev.next = head;
//         while(curr!=null && curr.next !=null){
//             if((curr.val<curr.next.val && curr.val<prev.val) || (curr.val>curr.next.val && curr.val>prev.val)){
//                 ls.add(curr.val);
//                 prev = prev.next;
//                 curr = curr.next;
//                 count++;
//             }
//             prev = prev.next;
//             curr = curr.next;
//             count++;
//         }

//         Collections.sort(ls);
//         int[] ans = new int[2];
//         ans[0] = ls.get(0);
//         ans[1] = ls.get(1);

//         return ans;
//     }
// }

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        List<Integer> criticalPoints = new ArrayList<>();
        ListNode prev = head, curr = head.next;
        int index = 1;  // Start from the second node
        
        while (curr.next != null) {
            if ((curr.val<curr.next.val && curr.val<prev.val) || (curr.val>curr.next.val && curr.val>prev.val)) {
                criticalPoints.add(index);
            }
            prev = prev.next;
            curr = curr.next;
            index++;
        }

        if (criticalPoints.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < criticalPoints.size(); i++) {
            minDistance = Math.min(minDistance, criticalPoints.get(i) - criticalPoints.get(i - 1));
        }

        int maxDistance = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);

        return new int[]{minDistance, maxDistance};
    }
}