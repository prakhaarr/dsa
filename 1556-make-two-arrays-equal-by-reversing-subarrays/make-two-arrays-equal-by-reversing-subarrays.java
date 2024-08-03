class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] visited1 = new int[1001];
        int[] visited2 = new int[1001];

        for(int i=0;i<target.length;i++){
            visited1[target[i]]++;
        }
        
        for(int i=0;i<arr.length;i++){
            visited2[arr[i]]++;
        }
        boolean anss = Arrays.equals(visited1,visited2);
        return anss;
    }
}