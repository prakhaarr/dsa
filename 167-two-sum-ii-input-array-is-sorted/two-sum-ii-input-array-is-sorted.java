class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] anss = new int[2];
        
        int n = numbers.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // anss[0] = left+1;
                // anss[1] = right+1;
                return new int[] {left+1,right+1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {left+1,right+1};
    }
}