class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k<=1)
        {
            return 0;
        }
        int i =0;
        int j=0;
        int count =0;
        int prod = 1;

        while(j<nums.length)
        {
            prod *=nums[j];

            while(prod>=k){
                prod /= nums[i];
                i++;
            }

            count += (j-i+1);
            j++;
        }
        return count;
    }
}