class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mp.put(matrix[i][j],1);
            }
        }

        if(mp.containsKey(target)){
            return true;
        }

        return false;
    }
}