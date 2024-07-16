class Solution {
    public int maxSubArray(int[] nums) {
    int sum=0;
    int ans=Integer.MIN_VALUE;
    for(int i : nums)
    {
        sum = sum+i;
        ans=Math.max(sum,ans);//sum = -2 therefore ans = -2
        if(sum<0) sum=0;
    }
    return ans;
    }
}
