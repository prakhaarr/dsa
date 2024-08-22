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
    public int helper(TreeNode root){
        if(root == null) return 0;

        int lh = helper(root.left);
        if(lh==-1) return -1;

        int rh = helper(root.right);
        if(rh==-1) return -1;

        if(Math.abs(lh-rh)>1) return -1;

        return 1+ Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        if(helper(root)==-1) return false;

        else{
            return true;
        }
    }
}