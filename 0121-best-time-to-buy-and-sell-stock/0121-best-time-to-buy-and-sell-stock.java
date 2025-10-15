class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int best = 0;

        for(int i = 0 ; i<prices.length;i++){
            int p = prices[i];
            best = Math.max(best,p-minSoFar);
            minSoFar = Math.min(minSoFar,p);

        }
        return best;
}
}