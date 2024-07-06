class Solution {
    public int passThePillow(int n, int time) {
        if(time < n){
            return time+1;
        }

        int rounds = time/(n-1); // shows no. of rounds
        int temp = time % (n-1); // shows at which position

        if(rounds%2==1){ // if rounds are even, i.e it will start temp from begining anf id odd it will start from back
            return n-temp;
        }
        return temp+1; //anf id odd it will start from back

        
    }
}