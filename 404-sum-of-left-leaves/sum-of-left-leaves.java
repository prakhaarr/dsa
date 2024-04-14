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
    public int sumOfLeftLeaves(TreeNode root) {
    if(root == null){
        return 0;
    }
    
    int sum = 0;

    TreeNode left = root.left;
    TreeNode right = root.right;
    
    if(left != null && left.left == null && left.right == null){
        sum += left.val;
    }
    sum += sumOfLeftLeaves(left); 
    sum += sumOfLeftLeaves(right);
    return sum;
}


   
}