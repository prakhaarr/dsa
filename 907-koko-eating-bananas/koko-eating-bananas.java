class Solution {

    public static boolean helper(int[] arr, int h, int speed){
        int hours =0;
        for(int pile : arr){
            hours+= (int)Math.ceil((double)pile/speed); 
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed =1;
        int maxSpeed =0;

        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }
        while(minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed-minSpeed)/2;

            if(helper(piles,h,mid)){
                maxSpeed = mid;
            }
            else{
                minSpeed = mid+1;
            }
        }
        return minSpeed;
    }
}