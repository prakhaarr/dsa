public class Solution {
    public boolean canBeValid(String str, String lockStatus) {
        if (str.length() % 2 != 0) 
            return false;

        int openCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (lockStatus.charAt(i) == '0' || str.charAt(i) == '(') 
                openCount++;
            else 
                openCount--;
            if (openCount < 0) 
                return false;
        }

        openCount = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (lockStatus.charAt(i) == '0' || str.charAt(i) == ')') 
                openCount++;
            else 
                openCount--;
            if (openCount < 0) 
                return false;
        }
        return true;
    }
}