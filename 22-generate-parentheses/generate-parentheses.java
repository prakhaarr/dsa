class Solution {

    private void helper(List<String>ans, int n , int open, int close, String curr){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(open <n){
            helper(ans,n,open+1,close,curr+"(");
        }
        if(close<open){
            helper(ans,n,open,close+1,curr+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        String temp = new String();
        helper(ls,n,0,0,temp);
        return ls;
    }
}