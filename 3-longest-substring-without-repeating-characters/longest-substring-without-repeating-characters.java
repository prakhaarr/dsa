class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans =0;
        int i =0;
        int j =0;
        HashSet<Character> hs = new HashSet<>(); // agar room se hua nikal lenge for sure

        while(i<s.length() && j<s.length())
        {
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j++));
                ans = Math.max(ans,j-i);
            }
            else{
                hs.remove(s.charAt(i++));
            }
        }

        return ans;
        
    }
}