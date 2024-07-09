class Solution {
    public double averageWaitingTime(int[][] customers) {

        List<Integer> ls = new ArrayList<>();

        int timeTaken =0;
        int time = customers[0][0] + customers[0][1];
        ls.add(time-customers[0][0]);
        //timeTaken = time-customers[0][0];


        for(int i =1;i<customers.length;i++){
            time = Math.max(time + customers[i][1],customers[i][0]+customers[i][1]);
            int ans = time - customers[i][0];
            ls.add(ans);
            //timeTaken += ans;
        }
        // double finall = timeTaken/customers.length;
        double finall = 0;
        for(int i=0;i<ls.size();i++){
            finall+=ls.get(i);
        }

        return finall/ls.size();
        
    }
}