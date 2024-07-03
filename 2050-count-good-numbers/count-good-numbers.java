// class Solution {
//     int modulo= 1000000007;
//     public int countGoodNumbers(long n) {
        
//       return (int)((rec(n/2,4)*rec((n+1)/2,5))%modulo);
//     }
//     long rec(long n, int x)
//     {
       
//         if(n==0)
//             return 1;
//         long num = rec(n/2,x);
//         return (num*num)*(n%2==0?1:x)%modulo;
        
//     }

// }

class Solution {
    private long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long first = pow(5,even)%MOD;
        long second = pow(4,odd)%MOD;
        return (int)((first*second)%MOD);
    }                     
    private long pow(long x,long n)
    {
        if(n==0)return 1;
        long temp = pow(x,n/2);
        if(n%2==0)
        {
            return (temp*temp)%MOD;
        }        
        return (x*temp*temp)%MOD;
        }
    }