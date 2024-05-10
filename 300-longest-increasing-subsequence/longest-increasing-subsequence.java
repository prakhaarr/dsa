class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        return lol(nums,n);

    }

    public static int lol(int arr[], int n){
        int max =0;
        int lis[] = new int[n];
        for(int i =0;i<n;i++){
            lis[i] = 1;
        }

        for(int i =1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && lis[i]<lis[j] +1){
                    lis[i] = lis[j] +1;
                }
            }
        }

        for(int i =0;i<n;i++){
            if(max<lis[i]){
                max = lis[i];
            }
        }

        return max;
    }
}