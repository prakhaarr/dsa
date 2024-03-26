class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        int maxi = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            mp.put(nums[i], true);
            maxi = Math.max(maxi, nums[i]);
        }
        for (int i = 1; i < maxi; i++) {
            if (!mp.containsKey(i))
                return i;
        }
        return maxi < 0 ? 1 : maxi + 1;
    }
}