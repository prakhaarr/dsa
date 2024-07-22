class Solution {
    
    private int robHelper(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return rob(nums, start, end, dp);
    }
    
    private int rob(int[] nums, int start, int end, int[] dp) {
        if (start > end) return 0;
        if (dp[start] != -1) return dp[start];
        
        int robThisHouse = nums[start] + rob(nums, start + 2, end, dp);
        int skipThisHouse = rob(nums, start + 1, end, dp);
        
        return dp[start] = Math.max(robThisHouse, skipThisHouse);
    }
    
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        // Case 1: Rob houses from 0 to n-2 (excluding the last house)
        int maxRob1 = robHelper(nums, 0, nums.length - 2);
        
        // Case 2: Rob houses from 1 to n-1 (excluding the first house)
        int maxRob2 = robHelper(nums, 1, nums.length - 1);
        
        // The result is the maximum amount robbed in the two cases
        return Math.max(maxRob1, maxRob2);
    }
}
