class Solution {
    public static int helper(int m, int n, int i, int j, int[][] grid, int[][]dp){
        if(i>=m || j>=n) return Integer.MAX_VALUE;

        if(dp[i][j]!=-1) return dp[i][j];

        if(i== m-1 && j == n-1) return grid[i][j];
        int down = helper(m,n,i+1,j,grid,dp);
        int right = helper(m,n,i,j+1,grid,dp);

        int mini = Math.min(down,right);

        return dp[i][j] = grid[i][j] + mini;
        
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for (int[] row: dp){
            Arrays.fill(row, -1);
        }


        return helper(m,n,0,0,grid,dp);
    }
}