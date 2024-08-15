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
    //Same will be done for the linked list, just insert all nodes in HashMap and check wether these are already there in map or not , if available return that node, else keep on adding
    
}