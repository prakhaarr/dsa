class Solution {
    private void findComb(int index, int[] arr, int target, List<List<Integer>>ans,List<Integer> ds){
        if(index==arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        //not taking that element, means same index
        if(arr[index]<=target){
            ds.add(arr[index]);
            findComb(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);

        }
        // moving to new index
        findComb(index+1,arr,target,ans,ds);
    }



    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0,candidates,target,ans,new ArrayList<>());

        return ans;
    }
}