class Solution {
    public String customSortString(String order, String s) {
        int [] arr = new int [26];
        for (int i = 0; i < s.length(); i ++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < order.length(); i ++) {
            for (int j = 0; j < arr[order.charAt(i) - 'a']; j ++) {
                result.append(order.charAt(i));
            }
            arr[order.charAt(i) - 'a'] = 0;
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < arr[i]; j++) {
                result.append((char) ('a' + i));
            }
        }
        return result.toString();
    }
}