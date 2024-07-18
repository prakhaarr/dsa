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
    public int countPairs(TreeNode root, int distance) {
        int[] count = new int[1];
        dfs(root, distance, count);
        return count[0];
    }

    private List<Integer> dfs(TreeNode node, int distance, int[] count) {
        List<Integer> leaves = new ArrayList<>();

        if (node == null) {
            return leaves;
        }

        if (node.left == null && node.right == null) {
            leaves.add(1);
            return leaves;
        }

        List<Integer> leftLeaves = dfs(node.left, distance, count);
        List<Integer> rightLeaves = dfs(node.right, distance, count);

        for (int i = 0; i < leftLeaves.size(); i++) {
            for (int j = 0; j < rightLeaves.size(); j++) {
                if (leftLeaves.get(i) + rightLeaves.get(j) <= distance) {
                    count[0]++;
                }
            }
        }

        for (int i = 0; i < leftLeaves.size(); i++) {
            leaves.add(leftLeaves.get(i) + 1);
        }

        for (int i = 0; i < rightLeaves.size(); i++) {
            leaves.add(rightLeaves.get(i) + 1);
        }

        return leaves;
    }
}