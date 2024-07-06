class Solution {
    public int passThePillow(int n, int time) {
        if(time < n){
            return time+1;
        }

        int rounds = time/(n-1);
        int temp = time % (n-1);

        if(rounds%2==1){
            return n-temp;
        }
        return temp+1;

        
    }
}