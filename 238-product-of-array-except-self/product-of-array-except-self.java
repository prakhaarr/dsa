class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        // Initialize product to 1
        int product = 1;
        
        // Calculate product of all elements to the left of current element
        for (int i = 0; i < nums.length; i++) {
            ans[i] = product;
            product *= nums[i];
        }
        
        // Reset product to 1
        product = 1;
        
        // Calculate product of all elements to the right of current element and multiply with the previously calculated product
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= product;
            product *= nums[i];
        }
        
        return ans;        
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
        
//         int[] ans = new int[nums.length];
//         for(int i=0;i<nums.length;i++)
//         {
//             int count =1;
//             for(int j =0;j<nums.length;j++)
//             {
//                 if(nums[i]!=nums[j])
//                 {
//                     count *= nums[j];
                    
//                 } 
//             }
//             ans[i] = count;
//         }

//         return ans;        
//     }
// }