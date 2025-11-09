class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                return true;
            }
            mp.put(nums[i],i);
        }
        return false;
    }
}