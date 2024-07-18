class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet <Integer> mp = new HashSet<>();

        // for(int i =0;i<nums.length;i++)
        // {
        //     if(mp.contains(nums[i])){
        //         return nums[i];
        //     }

        //     else{
        //         mp.add(nums[i]);
        //     }
        // }
        
        // return -1;

        boolean[] map = new boolean[nums.length+1];
        for(int i =0;i<nums.length;i++){
            if(map[nums[i]]==true){
                return nums[i];
            }

            map[nums[i]] = true;
        }

        //System.gc();
        return 0;

    }
}