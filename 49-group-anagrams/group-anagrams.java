class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hm=new HashMap<>();   
        
        for(String st:strs){
            char[] arr=st.toCharArray();
            Arrays.sort(arr);
            String cannonical=new String(arr);
            if(!hm.containsKey(cannonical)){
                hm.put(cannonical,new LinkedList<String>());
            }
            
            hm.get(cannonical).add(st);
        }
       
        return new LinkedList<>(hm.values());
    }
}