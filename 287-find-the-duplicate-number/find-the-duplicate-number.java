class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] map = new boolean[nums.length+1];
        for(int i =0;i<nums.length;i++){
            if(map[nums[i]]==true){
                return nums[i];
            }

            map[nums[i]] = true;
        }
        return 0;

    }
}