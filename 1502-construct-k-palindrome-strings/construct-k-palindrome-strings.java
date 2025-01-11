class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        for (int i = 0; i < 26; i++)
            if ((k -= freq[i] % 2) < 0)
                return false;
        return true;
    }
}