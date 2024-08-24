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
    public void helper(List<Integer> ls , TreeNode root){
        if(root==null) return;

        helper(ls,root.left);
        ls.add(root.val);
        helper(ls,root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();
        helper(ls,root);

        Collections.sort(ls);
        //System.out.println(ls);
        return ls.get(k-1);
    }
}