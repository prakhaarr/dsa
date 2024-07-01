class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int j =0;
        for(int i=0;i<arr.length-2;i++){
            
            if((arr[i] % 2==1) && (arr[i+1] % 2==1) && (arr[i+2] %2 ==1)){
                j =3;
                break;
            }
        }

        if(j==3){
            return true;
        }
        return false;
    }
}