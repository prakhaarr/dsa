class Solution {

    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ls = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
       
        for(int i=0;i<m;i++){
            int temp = Integer.MAX_VALUE;
            for(int j =0;j<n;j++){
                if(matrix[i][j] < temp){
                    temp = matrix[i][j];
                }
            }
            ls.add(temp);
            
        }
        

        for(int j=0;j<n;j++){
            int temp2 = Integer.MIN_VALUE;
            for(int i =0;i<m;i++){
                if(matrix[i][j] > temp2){
                    temp2 = matrix[i][j];
                } 
            }
            ls2.add(temp2);
            
        }
        

        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<ls.size();i++){
            if(ls2.contains(ls.get(i))){
                ans.add(ls.get(i));
            }
        }

        System.gc();

        return ans;

        
        
        
    }

    // public List<Integer> luckyNumbers (int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     List<Integer> minRows = new ArrayList<>();
    //     List<Integer> maxCols = new ArrayList<>();
        
    //     // Finding minimum in each row
    //     for(int i = 0; i < m; i++){
    //         int minRow = Integer.MAX_VALUE;
    //         for(int j = 0; j < n; j++){
    //             if(matrix[i][j] < minRow){
    //                 minRow = matrix[i][j];
    //             }
    //         }
    //         minRows.add(minRow);
    //     }

    //     // Finding maximum in each column
    //     for(int j = 0; j < n; j++){
    //         int maxCol = Integer.MIN_VALUE;
    //         for(int i = 0; i < m; i++){
    //             if(matrix[i][j] > maxCol){
    //                 maxCol = matrix[i][j];
    //             }
    //         }
    //         maxCols.add(maxCol);
    //     }

    //     // Finding common elements in minRows and maxCols
    //     List<Integer> ans = new ArrayList<>();
    //     for(int num : minRows){
    //         if(maxCols.contains(num)){
    //             ans.add(num);
    //         }
    //     }

    //     return ans;
    // }
}