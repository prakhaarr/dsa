class Solution {
    public long customGCD(long x, long y) {
        while (y > 0) {
            long temp = x;
            x = y;
            y = temp % y;
        }
        return x;
    }

    public long findKthSmallest(int[] numbers, int target) {
        int length = numbers.length;
        long[] lcmArray = new long[1 << length];
        for (int i = 0; i < length; i++) {
            lcmArray[1 << i] = numbers[i];
        }

        lcmArray[0] = 1;
        for (int i = 1; i < 1 << length; i++) {
            if (lcmArray[i] == 0) {
                int q = i & (i - 1);
                int r = i & -i;
                lcmArray[i] = lcmArray[q] / customGCD(lcmArray[q], lcmArray[r]) * lcmArray[r];
            }
        }

        long low = 0, high = Long.MAX_VALUE;
        while (high - low > 1) {
            long mid = low + (high - low) / 2;
            long count = 0;
            for (int i = 1; i < 1 << length; i++) {
                count += mid / lcmArray[i] * ((Integer.bitCount(i) & 1) == 0 ? -1 : 1);
            }
            if (count >= target) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return high;
    }
}
