class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int m = accounts.length;
        int n = accounts[0].length;
            for(int i=0; i<m; i++){
                    int w = 0; 
                for(int j=0; j<n; j++){
                    w += accounts[i][j];
                }
                if(max<=w){
                    max = w;
                }
            }
            return max;
        
    }
}