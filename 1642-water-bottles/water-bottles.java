class Solution {

    // public int func(int bottles,int exchange){
    //     if((bottles / exchange)<1){
    //         return 0;
    //     }
    //     int full = bottles/exchange;
    //     int empty = bottles%exchange;
    //     if((full + empty)<=exchange){
    //         return full;
    //     }
    //     int ans = (full+empty);
    //     return full + func(ans, exchange);
    // }

    // public int func(int bottles,int exchange){
    //     int f = bottles/exchange;
    //     int e = bottles%exchange;
    //     int sum = bottles;

    //     if((f+e)>exchange){
    //         sum+=func(f+e,exchange);
    //         return sum;
            
    //     }
    //     else{
    //         sum+=f;
    //     }
    //     return sum;
        
    // }

    public int numWaterBottles(int numBottles, int numExchange) {
        //return func(numBottles,numExchange);
        int total = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            total += newBottles;
            empty = newBottles + (empty % numExchange);
        }

        return total;

        
    }
}