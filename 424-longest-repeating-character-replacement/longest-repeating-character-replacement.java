class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int maxLen = 0;
        int left =0;
        int maxFre = 0;
        for(int right = 0;right<s.length();right++){
            arr[s.charAt(right)-'A']++;
            maxFre = Math.max(maxFre,arr[s.charAt(right)-'A']);

            if(right-left - maxFre >=k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }

        return maxLen;
    }
}