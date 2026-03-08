class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currTime =0;
        int n = customers.length;
        long totalTime=0;
        for(int i = 0 ; i < n ; i++ ){
            if(currTime < customers[i][0]){
                currTime = customers[i][0];
            }
            currTime += customers[i][1];
            totalTime += currTime - customers[i][0];
        }

        return (double) totalTime/n;
        
    }
}