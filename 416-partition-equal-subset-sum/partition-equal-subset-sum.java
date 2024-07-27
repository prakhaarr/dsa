class Solution {
    public static boolean solve(int ind,int[] arr,int target,Boolean[][] memo){
		if(target==0){
			return true;
		}
		if(ind==0){
			return arr[0]==target;
		}
		if(memo[ind][target]!=null) return memo[ind][target];
		if(arr[ind]>target){
		memo[ind][target]=solve(ind-1,arr,target,memo);
		return memo[ind][target];
		}
		memo[ind][target]=solve(ind-1,arr,target-arr[ind],memo)||solve(ind-1,arr,target,memo);
		return memo[ind][target];
	}
    
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
		for(int i=0;i<n;i++){
			sum+=nums[i];
		}
		if(sum%2!=0){
			return false;
		}
		int target=sum/2;
		Boolean [][]memo=new Boolean[n+1][target+1];
		return solve(n-1,nums,target,memo);
    }
    
}