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
    public void inOrder(TreeNode root,List<Integer> ls){
        if(root==null) return;

        inOrder(root.left,ls);
        ls.add(root.val);
        inOrder(root.right,ls);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        inOrder(root,ls);
        int prev = ls.get(0);
        boolean isBST = true;

        for(int i=1;i<ls.size();i++){
            if(ls.get(i)<=prev) isBST = false;
            prev = ls.get(i);
        }

        return isBST;
        
    }
}