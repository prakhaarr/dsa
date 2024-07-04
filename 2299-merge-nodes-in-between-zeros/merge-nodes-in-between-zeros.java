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
    public ListNode mergeNodes(ListNode head) {
        ListNode originalHead = head;
        ListNode curr = head.next;
        int sum =0;

        while(curr!=null){
            if(curr.val==0){
                head.val = sum;
                sum =0;
                if(curr.next !=null){
                    head = head.next;
                } 
            }
            sum += curr.val;
            curr = curr.next;
        }

        head.next = null;
        return originalHead;










        // ListNode temp = head;
        // List<Integer> ls = new ArrayList<>();
        // List<Integer> ans = new ArrayList<>();
        // while(temp!=null){
        //     ls.add(temp.val);
        //     temp =temp.next;
        // }

        // for(int i=1;i<ls.size();i++){
        //     int sum =0;
        //     if(ls.get(i)!=0 && ls.get(i-1)==0){
        //         sum+=ls.get(i);
        //     }
        //     for(int j = i+1;j<ls.size();j++){
        //         if(ls.get(i) !=0 && ls.get(j) !=0 && sum != 0){
        //             sum+=ls.get(j);
        //         }
        //         else{
        //             if(ls.get(j)==0){
        //                 break;
        //             }
        //         }
        //     }
        //     if(sum!=0){
        //             ans.add(sum);
        //     }
            
        // }
        // //System.out.print(ans);

        // ListNode result = new ListNode(0);
        // ListNode op = result;

        // for(int i=0;i<ans.size();i++){
        //     op.next = new ListNode(ans.get(i));
        //     op = op.next;
        // }



        // return result.next;



        
    }
}