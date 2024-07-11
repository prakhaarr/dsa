class Solution {
    
    private void rec(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Include the current number in the subset
        current.add(nums[index]);
        rec(nums, index + 1, current, result);
        
        // Exclude the current number from the subset
        current.remove(current.size() - 1);
        rec(nums, index + 1, current, result);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        rec(nums, 0, current, result);
        return result;
        
    }
}