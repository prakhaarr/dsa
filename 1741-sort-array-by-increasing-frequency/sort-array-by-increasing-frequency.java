class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0;i<nums.length;i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        
        List<Integer> numList = new ArrayList<>();
        for (int i = 0;i<nums.length;i++) {
            numList.add(nums[i]);
        }

        Collections.sort(numList, (a, b) -> {
            int freqCompare = freqMap.get(a) - freqMap.get(b);
            if (freqCompare != 0) {
                return freqCompare;
            } else {
                return b - a;
            }
        });
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < numList.size(); i++) {
            sortedNums[i] = numList.get(i);
        }
        // System.gc();

        return sortedNums;
    }
}
