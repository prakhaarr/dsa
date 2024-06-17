
class Solution {
    void helper(int nums[],int i,List<Integer> subset,List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(subset));
            return ;
        }
        
         subset.add(nums[i]);
        
        // We ask recursion to do rest of the task
        
        helper(nums, i + 1, subset, ans);
        
        // Backtrack and Undo the change we have done
        
        subset.remove(subset.size() - 1);
        
        // While using Don't Pick option, we must ensure we skip all the Duplicate Occurrences of nums[i]
    
        while(i < nums.length - 1 && (nums[i] == nums[i + 1] ) )
        {
            i++ ;
        }
        helper(nums, i + 1, subset, ans);
        return ;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> t = new ArrayList<>();

        Arrays.sort(nums);
        helper(nums,0, t, ans);
        return ans;
    }
}