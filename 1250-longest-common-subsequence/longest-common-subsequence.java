class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];

        return lcs(text1,text2,dp);

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
}