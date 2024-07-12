// class Solution {
//     public int maximumGain(String s, int x, int y) {
//         Stack<Character> stack = new Stack<>();
//         int sum =0;
//         int sum2 =0;
//         StringBuilder sb = new StringBuilder();
//         for(int i =0;i<s.length();i++){
//             if(stack.isEmpty()){
//                 stack.push(s.charAt(i));
//                 sb.append(s.charAt(i));
                
//             }
//             else if(s.charAt(i)=='a' && stack.peek()=='b'){
//                 stack.pop();
//                 sum +=x;
//             }

//             else{
//                 stack.push(s.charAt(i));
//                 sb.append(s.charAt(i));
//             }
//         }

        
//         String s2 = sb.toString();

//         for(int i =0;i<s2.length();i++){
//             if(stack.isEmpty()){
//                 stack.push(s2.charAt(i));
                
//             }
//             else if(s2.charAt(i)=='b' && stack.peek()=='a'){
//                 stack.pop();
//                 sum +=y;
//             }

//             else{
//                 stack.push(s2.charAt(i));
//             }
//         }
//         return sum;
//     }
// }

// class Solution {
//     public int maximumGain(String s, int x, int y) {
//         Stack<Character> stack = new Stack<>();
//         int sum = 0;
//         StringBuilder sb = new StringBuilder();

//         // Process the string for "ab" pairs
//         for (int i = 0; i < s.length(); i++) {
//             if (!stack.isEmpty() && s.charAt(i) == 'b' && stack.peek() == 'a') {
//                 stack.pop();
//                 sum += x;
//             } else {
//                 stack.push(s.charAt(i));
//             }
//         }

//         // Collect remaining characters after removing "ab" pairs
//         while (!stack.isEmpty()) {
//             sb.append(stack.pop());
//         }

//         // Reverse the string builder to process the remaining characters in order
//         sb.reverse();
//         String remainingString = sb.toString();

//         // Clear the stack for the next round
//         stack.clear();
//         sb.setLength(0); // Clear the StringBuilder

//         // Process the remaining string for "ba" pairs
//         for (int i = 0; i < remainingString.length(); i++) {
//             if (!stack.isEmpty() && remainingString.charAt(i) == 'a' && stack.peek() == 'b') {
//                 stack.pop();
//                 sum += y;
//             } else {
//                 stack.push(remainingString.charAt(i));
//             }
//         }

//         return sum;
//     }
// }
class Result {
    int gain;
    String remainingString;
    
    Result(int gain, String remainingString) {
        this.gain = gain;
        this.remainingString = remainingString;
    }
}

class Solution {

    public int maximumGain(String s, int x, int y) {
        Result cal_ba;
        Result cal_ab;
        if (y > x) {
            cal_ba = calculateGains(s, y, 'b', 'a');
            cal_ab = calculateGains(cal_ba.remainingString, x, 'a', 'b');
            return cal_ba.gain + cal_ab.gain;
        } else {
            cal_ab = calculateGains(s, x, 'a', 'b');
            cal_ba = calculateGains(cal_ab.remainingString, y, 'b', 'a');
            return cal_ab.gain + cal_ba.gain;
        }
    }

    public Result calculateGains(String s, int g, Character first, Character second) {
        int gain = 0;
        Stack<Character> s1 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!s1.isEmpty() && s1.peek() == first && ch == second) {
                s1.pop();
                gain += g;
            } else {
                s1.push(ch);
            }
        }
        
        // Reconstruct the remaining string from the stack
        StringBuilder remaining = new StringBuilder();
        while (!s1.isEmpty()) {
            remaining.insert(0, s1.pop());
        }
        
        return new Result(gain, remaining.toString());
    }
}

