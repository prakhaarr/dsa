class Solution {
    public static void helper(List<Integer> ls, int i,List<List<Integer>> ans,int[] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }

        ls.add(nums[i]);
        helper(ls,i+1,ans,nums);

        ls.remove(ls.size()-1);
        helper(ls,i+1,ans,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(new ArrayList<>(),0,ans,nums);

        return ans;
    }
}