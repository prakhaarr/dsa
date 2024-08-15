class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[100001];
        for(int i =0;i<nums.length;i++){
            if(arr[nums[i]]!=0){
                return nums[i];

            }
            else{
                arr[nums[i]]++;
            }
        }
        return 0;
        
    }
}