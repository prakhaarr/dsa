import java.util.*;

class Solution {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void helper(int[]nums,List<List<Integer>> ans, int i){
        if(i>=nums.length){
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }

        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            helper(nums,ans,i+1);
            swap(nums,i,j);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index =0;
        helper(nums,ans,index);
        return ans;
        
    }
}