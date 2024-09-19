class Solution {
    public String largestNumber(int[] nums) {
        // Convert the array of integers to an array of strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the string array using a custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated results of the numbers
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);  // Sort in descending order
            }
        });

        // If after sorting the largest number is "0", the result is "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating the sorted numbers
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }
}