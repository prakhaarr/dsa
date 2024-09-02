class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChkNeed = 0l;
        for(var chkNeed : chalk){
            totalChkNeed += chkNeed;
        }
        long chlkRem = k * 1l;
        chlkRem %= totalChkNeed;
        for(int indx = 0; indx < chalk.length; indx++){
             long chkNeed = chalk[indx] * 1l;
             if(chlkRem - chkNeed >= 0){
                chlkRem -= chkNeed;
             }else{
                return indx;
             }
        }
        return -1;
    }
}