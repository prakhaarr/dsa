// class Solution {
//     public static int helper(int i, int j, List<List<Integer>> ls, int sum,int[][] dp) {
//         if(dp[i][j]!= -1) return dp[i][j];
//         if (i == ls.size()) {
//             return sum;
//         }

//         int left = helper(i + 1, j, ls, sum + ls.get(i).get(j),dp);
//         int right = helper(i + 1, j + 1, ls, sum + ls.get(i).get(j),dp);

//         // Return the minimum path sum
//         return  dp[i][j] = Math.min(left, right);
//     }

//     public int minimumTotal(List<List<Integer>> triangle) {
//         int[][] dp = new int[triangle.size()+1][triangle.size()+1];
//         for(int[] row: dp){
//             Arrays.fill(row,-1);
//         }
//         return helper(0, 0, triangle,0,dp);
//     }
// }

import java.util.List;

class Solution {
    public static int helper(int n,int i, int j, List<List<Integer>> ls, int sum, int[][] dp) {
        // Base case: Reached the bottom of the triangle
        if (i == ls.size()) {
            return sum;
        }
        if (i == n - 1) return ls.get(i).get(j);
        
        // Check if the value has already been computed
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Calculate the minimum path sum for the left and right paths
        int left = ls.get(i).get(j) + helper(n,i + 1, j, ls, sum + ls.get(i).get(j), dp);
        int right = ls.get(i).get(j) + helper(n,i + 1, j + 1, ls, sum + ls.get(i).get(j), dp);

        // Store and return the minimum path sum
        return dp[i][j] = Math.min(left, right);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // Initialize the dp array with -1
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }
        // Start the helper function from the top of the triangle
        return helper(n,0, 0, triangle, 0, dp);
    }
}
