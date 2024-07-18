class Solution {

    public static void sortt(int[] nums, int low,int high){
        if(low>=high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot  = nums[mid];

        while(s<=e){
            while(nums[s] < pivot){
                s++;

            }
            while(nums[e] > pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        
        sortt(nums,low,e);
        sortt(nums,s,high);
        
    }



    public void sortColors(int[] nums) {
        // for(int i=nums.length-1;i>=0;i--){
        //     for(int j=0;j<i;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //         }
        //     }
        // }

        sortt(nums,0,nums.length-1);
        System.gc();


    }
}