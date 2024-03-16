class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int currSum = 0;
        mp.put(0, -1);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currSum += 1;
            } else {
                currSum += -1;
            }
            if (mp.containsKey(currSum)) {
                result = Math.max(result, i - mp.get(currSum));
            } else {
                mp.put(currSum, i);
            }
        }
        return result;
    }
}
