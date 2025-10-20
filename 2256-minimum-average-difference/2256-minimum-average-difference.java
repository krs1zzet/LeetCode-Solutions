class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;

        long total = 0;
        for (int x : nums) total += x;

        long leftSum = 0;
        long minDiff = Long.MAX_VALUE;
        int bestIdx = -1;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];                   
            long rightSum = total - leftSum;      

            long leftAvg  = leftSum / (i + 1);    
            long rightAvg = (i == n - 1) ? 0      
                           : (rightSum / (n - i - 1));

            long diff = Math.abs(leftAvg - rightAvg);

            if (diff < minDiff) {
                minDiff = diff;
                bestIdx = i;                      
            }
        }
        return bestIdx;
    }
}
