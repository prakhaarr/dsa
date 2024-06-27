class Solution {
    public int findCenter(int[][] edges) {
        HashSet<Integer> mp = new HashSet<>();

        int f00 = edges[0][0];
        int f01 = edges[0][1];

        int f10 = edges[1][0];
        int f11 = edges[1][1];

        if(f00 == f10 || f00==f11){
            return f00;
        }
        else if(f01 == f10 || f01 == f11){
            return f01;
        }
        return 1;
    }
}