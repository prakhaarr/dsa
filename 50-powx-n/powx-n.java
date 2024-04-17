class Solution {
    public double myPow(double x, int n) {
        double ans =0;
        if(n>0){
            ans = Math.pow(x,n);
            return ans;
        }

        else{
            long n0 = (long)-1*n;
            double n2 = Math.pow(x,n0);
            ans = (1/n2);
        }

        return ans;
    }
}