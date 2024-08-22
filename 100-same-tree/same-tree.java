/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // public List<Integer> helper(TreeNode root,List<Integer> ans){
    //     if(root==null){
    //         ans.add(null);
    //         return ans;
    //     }

    //     helper(root.left,ans);
    //     ans.add(root.val);
    //     helper(root.right,ans);

    //     return ans;
    // }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // List<Integer> ls1 = new ArrayList<>();
        // List<Integer> ls2 = new ArrayList<>();
        // helper(p,ls1);
        // helper(q,ls2);

        // return ls1.equals(ls2);
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }

        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));

    }
}