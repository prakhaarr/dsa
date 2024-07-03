class Solution {
    int modulo= 1000000007;
    public int countGoodNumbers(long n) {
        
      return (int)((rec(n/2,4)*rec((n+1)/2,5))%modulo);
    }
    long rec(long n, int x)
    {
       
        if(n==0)
            return 1;
        long num = rec(n/2,x);
        return (num*num)*(n%2==0?1:x)%modulo;
        
    }

}