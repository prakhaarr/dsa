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
        if(root ==null)
        {
            return wrapList;
        }

        q.add(root);

        while(!q.isEmpty())
        {
            int levelSum = q.size();
            List <Integer> subList = new LinkedList<>();

            for(int i=0;i<levelSum;i++)
            {
                if(q.peek().left!=null)
                {
                    q.offer(q.peek().left);
                }

                if(q.peek().right!=null)
                {
                    q.offer(q.peek().right);
                }

                subList.add(q.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
        
    }
}