class Solution {
    public static int helper(int i, int target, int[] coins, int[][] dp) {
        if (target == 0) return 0; // If target is 0, no coins are needed.
        if (i < 0 || target < 0) return Integer.MAX_VALUE - 1; // If out of coins or negative target, return large value.
        
        if (dp[i][target] != -1) return dp[i][target];
        
        // Not take the coin
        int notTaken = helper(i - 1, target, coins, dp);
        
        // Take the coin
        int taken = Integer.MAX_VALUE - 1;
        if (coins[i] <= target) {
            taken = 1 + helper(i, target - coins[i], coins, dp);
        }
        
        // Record the answer
        dp[i][target] = Math.min(taken, notTaken);
        return dp[i][target];
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int result = helper(n - 1, amount, coins, dp);
        return result == Integer.MAX_VALUE - 1 ? -1 : result;
    }
}