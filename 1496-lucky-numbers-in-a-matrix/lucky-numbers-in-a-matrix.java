class Solution {
    // public static int find(List<Integer> ls){
    //     ls.sort();
    //     return ls.get(0);
    // }
    // public List<Integer> luckyNumbers (int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     List<Integer> ls = new ArrayList<>();
    //     List<Integer> ls2 = new ArrayList<>();
    //     int temp=0;
        
    //     for(int i=0;i<m;i++){
    //         temp = Integer.MAX_VALUE;
    //         for(int j =0;j<n;j++){
    //             temp = Math.min(temp,matrix[i][j]);
    //         }
    //         ls.add(temp);
            
    //     }
        

    //     for(int i=0;i<m;i++){
    //         temp = Integer.MIN_VALUE;
    //         for(int j =0;j<n;j++){
    //             temp = Math.max(temp,matrix[j][i]);
    //         }
    //         ls2.add(temp);
            
    //     }
    //     HashSet<Integer> map = new HashSet<>();
    //     List<Integer> ans = new ArrayList<>();

    //     ls.addAll(ls2);
    //     for(int i =0;i<ls.size();i++){
    //         if(map.contains(ls.get(i))){
    //             ans.add(ls.get(i));
    //         }
    //         else{
    //             map.add(ls.get(i));
    //         }
    //     }

    //     return ans;

        
        
        
    // }

    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> minRows = new ArrayList<>();
        List<Integer> maxCols = new ArrayList<>();
        
        // Finding minimum in each row
        for(int i = 0; i < m; i++){
            int minRow = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                if(matrix[i][j] < minRow){
                    minRow = matrix[i][j];
                }
            }
            minRows.add(minRow);
        }

        // Finding maximum in each column
        for(int j = 0; j < n; j++){
            int maxCol = Integer.MIN_VALUE;
            for(int i = 0; i < m; i++){
                if(matrix[i][j] > maxCol){
                    maxCol = matrix[i][j];
                }
            }
            maxCols.add(maxCol);
        }

        // Finding common elements in minRows and maxCols
        List<Integer> ans = new ArrayList<>();
        for(int num : minRows){
            if(maxCols.contains(num)){
                ans.add(num);
            }
        }

        return ans;
    }
}