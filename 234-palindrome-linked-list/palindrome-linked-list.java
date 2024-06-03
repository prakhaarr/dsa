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

//     public ListNode reverse(ListNode head)
//     {
//         if(head== null || head.next == null)
//         {
//             return head;

//         }

//         ListNode newHead = reverse(head.next);
//         ListNode front = head.next;
//         front.next = head;
//         head.next = null;

//         return newHead;
//     }


//     public boolean isPalindrome(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
        

//         while(fast.next!= null && fast.next.next !=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         ListNode newHead = reverse(slow.next);
//         ListNode first = head;
//         ListNode second = newHead;

//         while(second!=null)
//         {
//             if(first.val != second.val)
//             {
//                 reverse(newHead);
//                 return false;
//             }
//             first = first.next;
//             second = second.next;
//             }
//         reverse(newHead);
//         return true;

//     }
// }

class Solution {
    public boolean isPalindrome(ListNode head) {
        // ListNode start = head;
        // ListNode mid = head;
        // ListNode fast = head;
        
        // while(fast != null && fast.next != null){
        //     mid = mid.next;
        //     fast= fast.next.next;
        // }
        
        // ListNode prev= null;
        // ListNode next = null;
        
        // while(mid != null){
        //     next = mid.next;
        //     mid.next = prev;
        //     prev= mid;
        //     mid = next;
        // }
        
        // while(prev!= null){

        //     if(prev.val!= start.val){
        //         return false;
        //     }
        //     prev= prev.next;
        //     start= start.next;
        // }
        // return true;

        ListNode temp = head;
        Stack<Integer> st = new Stack<>();

        // if(head==null){
        //     return false;
        // }

        // if(head.next == null){
        //     return head;
        // }

        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }

        while(head!=null){
            if(head.val == st.peek()){
                st.pop();
                head = head.next;
            }

            else{
                return false;
            }
        }

        return true;
    }
}