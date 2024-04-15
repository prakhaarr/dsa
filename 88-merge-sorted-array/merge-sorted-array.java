class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> ls = new ArrayList<>();

        for(int i =0;i<nums1.length;i++){
            if(nums1[i]!=0){
                ls.add(nums1[i]);
            }
            
        }
        for(int i =0;i<nums2.length;i++){
            if(nums2[i]!=0){
                ls.add(nums2[i]);
            }
            
        }

        for(int i =0;i<m+n;i++){
            if(ls.size()!=m+n){
                ls.add(0);
             }
        }
        

        Collections.sort(ls);

        for(int i=0;i<ls.size();i++){
        //    if(ls.get(i)!=0){
                nums1[i] = ls.get(i);
        //    }
        //    else{
        //     nums1[i]=0;
        //    }
        }

    }
}