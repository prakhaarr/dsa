class Solution {

    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ')') {
                stack.push(s.charAt(i));
            } else {
                // We've encountered a closing parenthesis, so start popping
                StringBuilder sb = new StringBuilder();
                while (stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                // Remove the opening parenthesis '('
                stack.pop();
                
                // Push the reversed substring back to the stack
                for (int j = 0; j < sb.length(); j++) {
                    stack.push(sb.charAt(j));
                }
            }
        }
        
        // Construct the final result from the stack
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < stack.size(); i++) {
            result.append(stack.get(i));
        }
        
        return result.toString();
    }

}