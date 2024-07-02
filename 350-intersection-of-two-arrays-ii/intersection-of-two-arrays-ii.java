class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Fill the map with the count of each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Iterate through nums2 and check if the element exists in the map with a non-zero count
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        

        // Convert the result list to an array
        int[] ansss = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ansss[i] = result.get(i);
        }

        return ansss;
    }
}
