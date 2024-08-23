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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if(root ==null)return wrapList;
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> ans = new ArrayList<>();
            int level = q.size();
            for(int i=0 ;i<level;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }

                ans.add(q.poll().val);

            }
            wrapList.add(ans);
        }
        return wrapList;
    }
}