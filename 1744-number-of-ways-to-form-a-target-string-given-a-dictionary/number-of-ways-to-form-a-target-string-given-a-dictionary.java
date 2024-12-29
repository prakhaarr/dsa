public class Solution {
    public int numWays(String[] words, String target) {
        int MOD = 1_000_000_007;
        int m = words[0].length();
        int n = target.length();
        
        int[][] freq = new int[26][m];
        for (String word : words) {
            for (int j = 0; j < m; j++) {
                freq[word.charAt(j) - 'a'][j]++;
            }
        }
        int[] dp = new int[n + 1];
        dp[0] = 1; 
        
        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                char targetChar = target.charAt(i);
                int charCount = freq[targetChar - 'a'][j];
                dp[i + 1] = (dp[i + 1] + (int)((long)dp[i] * charCount % MOD)) % MOD;
            }
        }
        return dp[n];
    }
}