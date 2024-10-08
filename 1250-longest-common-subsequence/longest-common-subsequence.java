class Solution {


    //Memoization Technique
    // public static int lcs(int ind1, int ind2, String t1, String t2, int[][] dp){
    //     if(ind1 <0 || ind2 <0) return 0;

    //     if(dp[ind1][ind2] != -1) return dp[ind1][ind2];

    //     if(t1.charAt(ind1) == t2.charAt(ind2)){
    //         return dp[ind1][ind2] = 1 + lcs(ind1 -1, ind2-1, t1,t2,dp);

    //     }
        
    //     return dp[ind1][ind2] = 0 + Math.max(lcs(ind1-1,ind2,t1,t2,dp),lcs(ind1,ind2-1,t1,t2,dp));
        

    // }

    int helper2(String text1, String text2){
        // tabulation
        int n = text1.length();
        int m = text2.length();
        int[][]dp = new int[n+1][m+1];
        for(int[]row:dp)
            Arrays.fill(row, -1);

        for(int i=0; i<=n; i++)
            dp[i][0] = 0; // first column
        for(int j=0; j<=m; j++)
            dp[0][j] = 0;  // first row

        for(int idx1=1; idx1<=n; idx1++){
            for(int idx2=1; idx2<=m; idx2++){
                if(text1.charAt(idx1-1) == text2.charAt(idx2-1))
                    dp[idx1][idx2] = 1 + dp[idx1-1][idx2-1];
                else
                    dp[idx1][idx2] = 0 + Math.max(dp[idx1][idx2-1], dp[idx1-1][idx2]);
            }
        }

        return dp[n][m];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        // int dp[][] = new int[text1.length()+1][text2.length()+1];

        // for(int[] rows : dp){
        //     Arrays.fill(rows,-1);
        // }

        return helper2(text1,text2);

    }
}



    //Tabulation
    // public static int lcs2(String a, String b, int dp[][]){
    
    //     for(int i=0;i<=a.length();i++){
    //         for(int j =0 ;j<=b.length();j++){
    //             if(i==0 || j==0){
    //                 dp[i][j] = 0;
    //             }
    //             else if(a.charAt(i-1)==b.charAt(j-1)){
    //                 dp[i][j] = dp[i-1][j-1]+1; // diagonal
    //             }
    //             else{
    //                 dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
    //             }
    //         }
    //     }

    //     return dp[a.length()][b.length()];
    // }
