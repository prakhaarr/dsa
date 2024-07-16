class Solution {
    

    public boolean isPalin(String s, int i, int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)==s.charAt(j)){
            return isPalin(s, i+1,j-1);
        }

        return false;
    }

    public String longestPalindrome(String s) {
        int maxLen = 0;
        int startPoint = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                if(isPalin(s,i,j)==true){
                    if((j-i+1) > maxLen){
                        maxLen = j-i+1;
                        startPoint = i;
                    }
                }
            }
        }


        return s.substring(startPoint,startPoint+maxLen);

    }
}