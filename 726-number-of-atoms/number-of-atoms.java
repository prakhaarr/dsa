class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        HashMap<String, Integer> currMap = new HashMap<>();
        Deque<HashMap<String, Integer>> st = new ArrayDeque<>();
        int i =0;
        while(i<n){
            if(formula.charAt(i)=='('){
                // Push the current map to stack and start a new one
                st.push(currMap);
                currMap = new HashMap<>();
                i++;
            }
            else if(formula.charAt(i)==')'){
                int iStart = ++i;
                int mul = 0;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    mul = mul*10 + formula.charAt(i) - '0';
                    i++;
                }
                if(mul==0) mul=1;
                // Pop the stack and merge the counts
                HashMap<String, Integer> topMap = currMap;
                currMap = st.pop();
                for(String key: topMap.keySet()){
                    currMap.put(key, currMap.getOrDefault(key, 0) +  topMap.get(key)* mul);
                }
            }
            else{
                // Parse the atom name
                int iStart = i++;
                while(i<n && Character.isLowerCase(formula.charAt(i))){
                    i++;
                }
                String name = formula.substring(iStart, i);
                //parse the count
                iStart = i;
                int count =0;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    count = count*10 + formula.charAt(i) - '0';
                    i++;
                }
                if(count==0)count=1;
                currMap.put(name, currMap.getOrDefault(name, 0)+count);
            }
        }
        //format the result
        StringBuilder ans = new StringBuilder();
        List<String> keys = new ArrayList<>(currMap.keySet());
        Collections.sort(keys);
        for(String key : keys){
            ans.append(key);
            if(currMap.get(key)>1){
                ans.append(currMap.get(key));
            }
        }
        return ans.toString();
    }
}