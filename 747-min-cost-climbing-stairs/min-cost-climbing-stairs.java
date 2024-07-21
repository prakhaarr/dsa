class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        if(n==2){
            return Math.min(cost[0],cost[1]);
        }
        for(int i =2;i<n;i++){
            cost[i] = cost[i] +Math.min(cost[i-1],cost[i-2]);

        }

        return 0 + Math.min(cost[n-1],cost[n-2]);
    }
}