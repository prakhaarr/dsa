class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][] = new int[s.length()+1][s.length()+1];
        StringBuilder sb = new StringBuilder();
        for(int i =s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String rev = sb.toString();

        return lcs(s,rev,dp);
    }

    public static int lcs(String a, String b, int dp[][]){
    
        for(int i=0;i<=a.length();i++){
            for(int j =0 ;j<=b.length();j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1; // diagonal
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[a.length()][b.length()];
    }

















    // public static int lps(String s) {
    //     int n = s.length();
    //     int[][] dp = new int[n][n];
    //     // Base case: single character is a palindrome of length 1
    //     for (int i = 0; i < n; i++) {
    //         dp[i][i] = 1;
    //     }
    //     // Process substrings of length 2 to n. <n->0 <=n -> 1 length -1 = last index
    //     for (int i = 2; i <= n; i++) {
    //         for (int start = 0; start <= n - i; start++) {
    //             int end = start + i - 1;
    //                 if (s.charAt(start) == s.charAt(end)) {
    //                     dp[start][end] = 2 + dp[start + 1][end - 1];
    //                 } else {
    //                     dp[start][end] = Math.max(dp[start + 1][end], dp[start][end - 1]);
    //                 }
    //         }
    //     }
    //         // Return longest palindromic subsequence length
    //     return dp[0][n-1];
    // }
}