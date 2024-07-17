class Solution {

    public static void helper(int[] arr, int target, int index, int currSum, List<Integer> currentList, List<List<Integer>> ans) {
        if (currSum == target) {
            ans.add(new ArrayList<>(currentList));
            return;
        }
        if (currSum > target || index == arr.length) {
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue; 
            }
            currentList.add(arr[i]);
            helper(arr, target, i + 1, currSum + arr[i], currentList, ans);
            currentList.remove(currentList.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // sort the array to handle duplicates   1,1,2,5,6,7,10
        helper(candidates, target, 0, 0, new ArrayList<>(), ans);
        System.gc();
        return ans;
    }
}