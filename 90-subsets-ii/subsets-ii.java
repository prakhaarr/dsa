
class Solution {
    public static void helper(int index, int[] nums, List<Integer> ds, List<List<Integer>> ans, int len){
        if(index==len){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        helper(index+1,nums,ds,ans,len);
        ds.remove(ds.size()-1);

        while(index + 1 < nums.length && nums[index] == nums[index + 1]){
            index++;
        }
        helper(index+1,nums,ds,ans,len);
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums, new ArrayList<>(), ans,nums.length);
        return ans;
    }
}