class Solution {


    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for(int i =2;i*i<=n;i++){
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }

    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(isPrime(nums[i])){
                ls.add(i);
            }
        }

        if (ls.isEmpty()) {
            return -1;
        }

        int first = ls.get(0);
        int last = ls.get(ls.size()-1);


        return last-first;
    }
}