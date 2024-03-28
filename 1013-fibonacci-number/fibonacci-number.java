class Solution {
    public int fib(int n) {
        if(n<=1)
        return n;
       int prev = 0;
        int next = 1;
        for(int i = 1;i<=n;i++){
            //System.out.print(next + " ");
            int curr = prev + next;
            prev = next;
            next = curr;
        }
        return prev;
    // if(n<=1)return n;

    // int i = fib(n-1);
    // int j = fib(n-2);

    // return i+j;
    }
}