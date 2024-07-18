class Solution {
    public int findDuplicate(int[] nums) {
        HashSet <Integer> mp = new HashSet<>();

        for(int i =0;i<nums.length;i++)
        {
            if(mp.contains(nums[i])){
                return nums[i];
            }

            else{
                mp.add(nums[i]);
            }
        }
        
        return -1;



    }
}