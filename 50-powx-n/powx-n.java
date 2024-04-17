class Solution {
    public double myPow(double x, int n) {
        double ans =0;
        if(n>0){
            ans = Math.pow(x,n);
            return ans;
        }

        else{
            long n0 = (long)-2*n;
            double n1 = (double)n0 + n;
            double n2 = Math.pow(x,n1);
            ans = (1/n2);
        }

        return ans;
    }
}