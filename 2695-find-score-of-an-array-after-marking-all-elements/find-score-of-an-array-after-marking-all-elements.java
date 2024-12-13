class Solution {
    public long findScore(int[] nums) {
        long rs = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int start = i;
            while (i < nums.length - 1 && nums[i + 1] < nums[i]) {
                i++;
            }

            for (int j = i; j >= start; j -= 2) {
                rs += nums[j];
            }
        }

        return rs;
    }
}