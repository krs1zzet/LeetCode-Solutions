class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        int right=0;
        int max = Integer.MIN_VALUE;
        for(int left = 0 ; left <= n-k ; left++){
            while(right-left!=k){
                total+=nums[right];
                right++;
            }
            if(total>max){
                max=total;
            }
            total-=nums[left];

        }

        double result = (double) max / k;
        double rounded = Math.round(result * 100000.0) / 100000.0;

        return rounded;
        
        
    }
}