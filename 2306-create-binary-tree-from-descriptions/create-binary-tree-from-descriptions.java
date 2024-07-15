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

    
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer,TreeNode> map = new HashMap<>();
        HashMap<Integer, Boolean> childMap = new HashMap<>();

        for(int i=0;i<descriptions.length;i++){
            int parentVal = descriptions[i][0];
            int childVal = descriptions[i][1];
            Boolean isLeft = descriptions[i][2] == 1;

            TreeNode parent = map.getOrDefault(parentVal, new TreeNode(parentVal));
            TreeNode child = map.getOrDefault(childVal, new TreeNode(childVal));

            if(isLeft){
                parent.left = child;
            }
            else{
                parent.right = child;
            }

            map.put(parentVal,parent);
            map.put(childVal,child);

            childMap.put(childVal,isLeft);
        }

        TreeNode root = null;
        for (int key : map.keySet()) {
            if (!childMap.containsKey(key)) {
                root = map.get(key);
                break;
            }
        }

        return root;


    }
}