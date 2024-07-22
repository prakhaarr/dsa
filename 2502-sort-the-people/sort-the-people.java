class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> mp = new HashMap<>();

        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);
        }

        TreeMap<Integer, String> sortMP = new TreeMap<>(Comparator.reverseOrder());
        sortMP.putAll(mp);
        System.out.print(sortMP);

        String[] ans = sortMP.values().toArray(new String[0]);


        return ans;
    }
}