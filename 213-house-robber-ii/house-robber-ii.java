class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        if (n == 3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        
        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
            arr2[i] = nums[i + 1];
        }
        
        int[] dp = new int[nums.length - 1];
        Arrays.fill(dp, -1);
        
        int ans1 = maximumSumMemoization(nums.length - 2, arr1, dp);
        Arrays.fill(dp, -1);
        int ans2 = maximumSumMemoization(nums.length - 2, arr2, dp);
        
        return Math.max(ans1, ans2);
    }
    public int maximumSumMemoization(int index, int []nums, int[] dp) {
        if (index == 0) return nums[index];
        if (index < 0) return 0;
        if (dp[index] != -1) return dp[index];
        int pick = nums[index] + maximumSumMemoization(index - 2, nums, dp);
        int notPick = 0 + maximumSumMemoization(index - 1, nums, dp);
        return dp[index] = Math.max(pick, notPick);
    }
}