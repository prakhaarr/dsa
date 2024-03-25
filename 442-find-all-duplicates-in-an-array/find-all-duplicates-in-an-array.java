class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i])){
                ans.add(nums[i]);
            }
            mp.put(nums[i],1);
        }

        return ans;
    }
}