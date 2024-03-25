class Solution {
    public String reverseWords(String s) {
        String[] ans = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i= ans.length-1;i >=0;i--)
        {
            sb.append(ans[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}