public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int[] prev = points[0];
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            int currStartPoint = points[i][0];
            int currEndPoint = points[i][1];
            int prevStartPoint = prev[0];
            int prevEndPoint = prev[1];
            prev = points[i];
            if (currStartPoint > prevEndPoint) {
                count++;
            } else {
                prev[0] = Math.max(prevStartPoint, currStartPoint);
                prev[1] = Math.min(currEndPoint, prevEndPoint);
            }
        }
        return count;
    }
}
