class Solution {
    public int minSwaps(int[] nums) {

        int n = nums.length;

        int[] temp = new int[2*n];

        for(int i =0;i<2*n;i++){
            temp[i] = nums[i%n];
        }

        int totalOnes = 0;
        for(int i =0;i<n;i++){
            if(nums[i]==1){
                totalOnes++;
            }
        }

        int i =0;
        int j =0;
        int currOnes =0;
        int maxCount =0;


        while(j<2*n){
            if(temp[j]==1){
                currOnes++;
    
            }

            if(j-i+1 > totalOnes){
                currOnes -= temp[i];
                i++;
            }
            maxCount = Math.max(maxCount,currOnes);
            j++;
        }

        return totalOnes - maxCount;





















        // int total = 0;
        // for (int num : nums) {
        //     total += num; // Total number of 1's in the array
        // }
        // int n = nums.length;
        
        // // If there are no 1's, no swaps are needed
        // if (total == 0) {
        //     return 0;
        // }
        
        // // Extend the array to handle the circular nature
        // int[] extendedNums = new int[n * 2];
        // System.arraycopy(nums, 0, extendedNums, 0, n);
        // System.arraycopy(nums, 0, extendedNums, n, n);
        
        // // Initialize the sliding window
        // int windowSum = 0;
        // for (int i = 0; i < total; i++) {
        //     windowSum += extendedNums[i];
        // }
        // int maxOnes = windowSum;
        // int swaps = total - maxOnes;
        
        // for (int i = 1; i < n; i++) {
        //     // Update the number of 1's in the current window by sliding the window
        //     windowSum += extendedNums[i + total - 1] - extendedNums[i - 1];
        //     maxOnes = Math.max(maxOnes, windowSum);
        //     swaps = Math.min(swaps, total - maxOnes);
        // }
        
        // return swaps;
    }
}