class Solution {

    public static void helper(int sum,int index, List<Integer> ds,int len, int target, List<List<Integer>> ans){
        if(ds.size()==len){
            if(sum==target){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        for(int i = index;i<=9;i++){
            ds.add(i);
            helper(sum+i,i+1,ds,len,target,ans);
            ds.remove(ds.size()-1);
        }

        // if(index<10){
        //     ds.add(index);
        //     sum+=index;
        //     helper(sum,index+1,ds,len,target,ans);

        //     ds.remove(ds.size()-1);
        //     sum-=index;
        //     helper(sum,index,ds,len,target,ans);
        // }
        // return;

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        //List<Integer> ds = new ArrayList<>();
        helper(0,1,new ArrayList<>(),k,n,ans);
        return ans;
    
    }

}