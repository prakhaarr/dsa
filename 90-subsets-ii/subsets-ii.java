
class Solution {
    // void helper(int nums[],int i,List<Integer> subset,List<List<Integer>> ans){
    //     if(i == nums.length){
    //         ans.add(new ArrayList<>(subset));
    //         return ;
    //     }
        
    //      subset.add(nums[i]);
        
    //     // We ask recursion to do rest of the task
        
    //     helper(nums, i + 1, subset, ans);
        
    //     // Backtrack and Undo the change we have done
        
    //     subset.remove(subset.size() - 1);
        
    //     // While using Don't Pick option, we must ensure we skip all the Duplicate Occurrences of nums[i]
    
    //     while(i < nums.length - 1 && (nums[i] == nums[i + 1] ) )
    //     {
    //         i++ ;
    //     }
    //     helper(nums, i + 1, subset, ans);
    //     return ;
    // }

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
        //List<Integer> ds = new ArrayList<>();

        Arrays.sort(nums);
        helper(0,nums, new ArrayList<>(), ans,nums.length);
        return ans;
    }
}