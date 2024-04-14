import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ls = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int currentSP = intervals[i][0];
            int currentEP = intervals[i][1];
            int prevSP = prev[0];
            int prevEP = prev[1];

            if (currentSP <= prevEP) {
                prev[1] = Math.max(prevEP, currentEP);
            } else {
                ls.add(prev);
                prev = intervals[i];
            }
        }

        ls.add(prev);

        return ls.toArray(new int[ls.size()][]);
    }
}