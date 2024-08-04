class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
        int n = nums.length;
        Set<List<Integer>> ls = new HashSet<>();
        if(nums==null || n<3) return new ArrayList(ls);

        Arrays.sort(nums);

        for(int i =0;i<n-2;i++){
            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = nums[i] +nums[left] + nums[right];

                if(sum==0){
                    ls.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }

            
        }
        return new ArrayList(ls);
    }
}