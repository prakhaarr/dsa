class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> bannedSet = new HashSet<>();
        for (int num : banned) bannedSet.add(num);
        int total = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (!bannedSet.contains(i)) {
                total += i;
                if (total <= maxSum) count++;
                else break;
            }
        }
        return count;
    }
}