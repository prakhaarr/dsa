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