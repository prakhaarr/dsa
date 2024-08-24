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
    public int helper(TreeNode root, int maxi){
        if(root == null){
            return 0;
        }

        int count =0;
        if(root.val>=maxi){
            count++;
        }
        maxi = Math.max(root.val,maxi);
        
        count+= helper(root.left,maxi);
        count+= helper(root.right,maxi);

        return count;

    }

    public int goodNodes(TreeNode root) {
        return helper(root,Integer.MIN_VALUE);


    }
}