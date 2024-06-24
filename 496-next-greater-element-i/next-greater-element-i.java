class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int ans[]=new int[nums2.length];
       int finalans[]=new int[nums1.length];
       HashMap<Integer , Integer> map=new HashMap<>();
       Stack <Integer> s=new Stack<>();
       for(int i=nums2.length-1; i>=0; i--){
           while(!s.isEmpty() && nums2[s.peek()]<nums2[i]){
               s.pop();
           }

           if(s.isEmpty()){
               ans[i]=-1;
           }else{
               ans[i]=nums2[s.peek()];
           }
           s.push(i);
       }

       for(int i=0; i<nums2.length; i++){
           map.put(nums2[i] , ans[i]);
       }
       for(int i=0; i<nums1.length; i++){
          int t= map.get(nums1[i]);
          finalans[i]=t;
       }

       return finalans;
    }
}