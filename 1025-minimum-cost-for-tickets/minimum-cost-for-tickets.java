class Solution {
     int n;
     int[] dp;
    public int solve(int in, int[] A, int[] B) {
        if (in >= n) {
            return 0;
        }
        
        if (dp[in] != -1) {
            return dp[in];
        }
        
        int ans = Integer.MAX_VALUE;
        ans = Math.min(ans, B[0] + solve(in + 1, A, B));
        int num = in;
        while (num < n && A[num] <= A[in] + 6) {
            num++;
        }
        ans = Math.min(ans, B[1] + solve(num, A, B));
        int ij = in;
        while (ij < n && A[ij] <= A[in] + 29) {
            ij++;
        }
        ans = Math.min(ans, B[2] + solve(ij, A, B));   
        return dp[in] = ans;
    }
    public int mincostTickets(int[] days, int[] costs) {
        n = days.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(0, days, costs);
    }
}