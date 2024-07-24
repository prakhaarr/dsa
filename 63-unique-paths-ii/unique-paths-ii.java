class Solution {
    public static int helper(int m, int n, int i,int j, int[][] grid,int[][] dp){
    
        if(i>=m || j>=n || grid[i][j]==1){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];

        dp[i][j] = helper(m,n,i+1,j,grid,dp) + helper(m,n,i,j+1,grid,dp);

        return dp[i][j]; 
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for (int[] row: dp){
            Arrays.fill(row, -1);
        }

        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        return helper(m,n,0,0,obstacleGrid,dp);

    }
}