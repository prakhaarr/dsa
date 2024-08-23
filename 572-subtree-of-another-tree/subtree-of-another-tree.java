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
// class Solution {
//     public String preOrder(TreeNode root){
//         if(root==null){
//             return "null";
//         }

//         StringBuilder sb = new StringBuilder("^");
//         sb.append(root.val);
//         sb.append(preOrder(root.left));
//         sb.append(preOrder(root.right));

//         return sb.toString();

//     }
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         String fullTree = preOrder(root);
//         String subTree = preOrder(subRoot);

//         return (fullTree.contains(subTree));
//     }
// }
class Solution {
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        if (subRoot == null) {
            return true;
        }

        if (root.val == subRoot.val) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}