class Solution {
    // public List<String> letterCombinations(String digits) {
    //     List<String> ls = new ArrayList<>();

    //     for(int i =0;i<digits.length();i++){
    //         if(digits.charAt(i)==2){
    //             ls.add("a");
    //             ls.add("a"+1);
    //             ls.add("a"+2);
    //         }
    //         else if(digits.charAt(i)==3){
    //             ls.add("a"+3);
    //             ls.add("a"+4);
    //             ls.add("a"+5);
    //         }
    //         else if(digits.charAt(i)==4){
    //             ls.add("a"+6);
    //             ls.add("a"+7);
    //             ls.add("a"+8);
    //         }
    //         else if(digits.charAt(i)==5){
    //             ls.add("a"+9);
    //             ls.add("a"+10);
    //             ls.add("a"+11);
    //         }
    //         else if(digits.charAt(i)==6){
    //             ls.add("a"+12);
    //             ls.add("a"+13);
    //             ls.add("a"+14);
    //         }
    //         else if(digits.charAt(i)==7){
    //             ls.add("a"+15);
    //             ls.add("a"+16);
    //             ls.add("a"+17);
    //         }
    //         else if(digits.charAt(i)==8){
    //             ls.add("a"+18);
    //             ls.add("a"+19);
    //             ls.add("a"+20);
    //         }
    //         else if(digits.charAt(i)==9){
    //             ls.add("a"+21);
    //             ls.add("a"+22);
    //             ls.add("a"+23);
    //         }
    //     }

    //     List<String> ans = new ArrayList<>();
    //     StringBuilder hehe = new StringBuilder();

    //     helper(0,hehe,ls,ans,digits.length());

    //     return ans;
        
    // }

    // public static void helper(int index, StringBuilder curr, List<String> ls, List<String> ans,int len){
    //     if(index==ls.size()){
    //         if(curr.length()==len){
    //             ans.add(curr.toString());
    //         }
    //     }

    //     curr.append(ls.get(index));
    //     helper(index+1,curr,ls,ans,len);
    //     curr.setLength(curr.length()-1);
    //     helper(index+1,curr,ls,ans,len);


    // }
    
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

        StringBuilder currentCombination = new StringBuilder();
        helper(digits, 0, currentCombination, ans);
        return ans;
    }

    private void helper(String digits, int index, StringBuilder currentCombination, List<String> ans) {
        if (index == digits.length()) {
            ans.add(currentCombination.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            helper(digits, index + 1, currentCombination, ans);
            currentCombination.setLength(currentCombination.length() - 1);  // backtrack
        }
    }
  
}