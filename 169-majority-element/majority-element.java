class Solution {
    public int majorityElement(int[] nums) {
    //     HashMap <Integer,Integer> mp = new HashMap<>();

    //     for(int i =0;i<nums.length;i++){
    //         mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
    //     }

    //     int maxKey = 0;
    //     int maxFrequency = 0;

    //     for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
    //         int key = entry.getKey();
    //         int frequency = entry.getValue();
    //         if (frequency > maxFrequency) {
    //             maxFrequency = frequency;
    //             maxKey = key;
    //         }
    //     }

    //     return maxKey;
    // }

    Arrays.sort(nums);

    return nums[nums.length/2];
    




    }
}