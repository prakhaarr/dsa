class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int numrow = rowSum.length;
        int numcol = colSum.length;
        int[][] ans = new int[numrow][numcol];

        int i,j;
        i =0;
        j=0;

        while(i<numrow && j<numcol){
            int val = Math.min(rowSum[i],colSum[j]);

            ans[i][j] = val;
            rowSum[i] -= val;
            colSum[j] -= val;

            if(rowSum[i]==0){
                i++;
            }

            if(colSum[j]==0){
                j++;
            }

        }

        return ans;


    }
}