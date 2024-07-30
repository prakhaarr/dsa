class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] char_count = new int[26];

        for(int i=0;i<s.length();i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }

        for(int i =0;i<char_count.length;i++){
            if(char_count[i]!=0){return false;}
        }

        return true;
        
    }
}