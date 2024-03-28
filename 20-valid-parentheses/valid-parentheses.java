import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false; // There is a closing bracket without a corresponding opening bracket
                }
                char top = stack.peek();
                if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
                    stack.pop();
                }

                else{
                    return false; // Mismatched brackets
                }
                    
                
            }
        }

        return stack.isEmpty(); // Stack should be empty if all opening brackets are closed properly
    }
}
