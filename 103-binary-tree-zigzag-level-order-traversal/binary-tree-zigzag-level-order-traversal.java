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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if(root==null){
            return wrapList;
        }

        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty())
        {
            int levelNum = q.size();
            ArrayList <Integer> subList = new ArrayList<>();
            for(int i =0;i<levelNum;i++)
            {
                if (q.peek().left != null)
                {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null)
                {
                    q.offer(q.peek().right);
                }
                if (flag == true)
                {
                    subList.add(q.poll().val); //poll is the starting element
                }
                else{
                    subList.add(0, q.poll().val);
                }

                
            }
            flag = !flag;
            wrapList.add(subList);
        }
        return wrapList;
    }
}