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
class Solution {
    public int maximumGain(String s, int x, int y) {
        
        int aCount = 0;
        int bCount = 0;
        int lesser = Math.min(x, y);
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'b') {
                result += Math.min(aCount, bCount) * lesser;
                aCount = 0;
                bCount = 0;
            } else if (c == 'a') {
                if (x < y && bCount > 0) {
                    bCount--;
                    result += y;
                } else {
                    aCount++;
                }
            } else {
                if (x > y && aCount > 0) {
                    aCount--;
                    result += x;
                } else {
                    bCount++;
                };
            }
        }
        
        result += Math.min(aCount, bCount) * lesser;
        
        return result;
    }
}