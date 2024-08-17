class Solution {
    public long maxPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;

        long[] dp = new long[m];
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[j] += points[i][j];
            }

            for (int j = 1; j < m; j++) {
                dp[j] = Math.max(dp[j], dp[j - 1] - 1);
            }
            for (int j = m - 2; j >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j + 1] - 1);
            }
        }

        for (int i = 0; i < m; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}