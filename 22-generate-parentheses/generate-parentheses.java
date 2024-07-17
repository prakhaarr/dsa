class Solution {

    public static void helper(List<String> ans , int n,int open, int close,String curr){
        if(curr.length()==n*2){
            ans.add(curr);
            return;
        }

        if(open<n){
            helper(ans,n,open+1,close,curr + "(");
        }
        if(close<open){
            helper(ans,n,open,close+1,curr + ")");
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,n,0,0,"");

        return ans;
    }
}