class Solution {
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }

        StringBuilder curr = new StringBuilder();
        helper(digits, 0, curr, ans);
        return ans;
    }

    private void helper(String digits, int index, StringBuilder curr, List<String> ans) {
        if (index == digits.length()) {
            ans.add(curr.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0']; //substracting 0 because we are using String 0 , so if we subtract it we will get the integer value
        for (char letter : letters.toCharArray()) {
            curr.append(letter);
            helper(digits, index + 1, curr, ans);
            curr.setLength(curr.length() - 1);  // backtrack
        }
    }
  
}