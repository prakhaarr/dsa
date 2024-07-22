class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp = new TreeMap<>();

        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);
        }
        String[] ans = new String[names.length];
        
        int j = ans.length-1;
        for(Map.Entry<Integer,String> m : mp.entrySet()){
            ans[j--] = m.getValue();
        }
        return ans;
    }
}