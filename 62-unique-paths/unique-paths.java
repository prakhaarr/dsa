class Solution {
    int[][] t;

    public int solve(int m, int n, int i, int j) {
        if(i >= m || i < 0 || j >= n || j < 0)
            return 0;
           
        if(i == m-1 && j == n-1)
            return 1;
        
        if(t[i][j] != -1) 
            return t[i][j];
        
        return t[i][j] = solve(m, n, i+1, j) + solve(m, n, i, j+1);
    }

    public int uniquePaths(int m, int n) {
        t = new int[m][n];
        for (int[] row: t)
            Arrays.fill(row, -1);
        
        return solve(m, n, 0, 0);
    }

}