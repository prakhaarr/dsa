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
    public static TreeNode lca(TreeNode root,int p,int q){
        if(root==null || root.val == p || root.val == q){
            return root;
        }

        TreeNode left = lca(root.left,p,q);
        TreeNode right = lca(root.right,p,q);
        if(left==null){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{
            return root;
        }
    }

    public static Boolean backtrack(TreeNode root, int target,StringBuilder path){
        if(root == null){
            return false;
        }
       
        if(root.val == target){
            return true;
        }

        path.append('L');
        if(backtrack(root.left, target, path)){
            return true;
        }
        //backtrack
        path.setLength(path.length()-1); // removing character from stringbuilder

        path.append('R');
        if(backtrack(root.right, target, path)){
            return true;
        }
        //backtrack
        path.setLength(path.length()-1);

        return false;
    }
    
        

    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lc = lca(root,startValue,destValue); 
        StringBuilder sourcetoLCA = new StringBuilder();
        StringBuilder LCAtodest = new StringBuilder();

        backtrack(lc,startValue,sourcetoLCA);
        backtrack(lc,destValue,LCAtodest);
        StringBuilder res = new StringBuilder();
        for(int i =0;i<sourcetoLCA.length();i++){
            res.append("U");
        }

        res.append(LCAtodest);

        return res.toString();

    }
}
