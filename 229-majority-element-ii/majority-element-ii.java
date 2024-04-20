class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> mp = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        int maxKey = 0;
        int maxFrequency = 0;
        List <Integer> ls = new ArrayList<>();
        int n = nums.length;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int key = entry.getKey();
            int comp = entry.getValue();
            if(comp>n/3){
                ls.add(key);
            }
        }

        return ls;
    }
}