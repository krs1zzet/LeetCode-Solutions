class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int r = 0;
        int l = 0;
        int max = Integer.MIN_VALUE;
        int count=0;

        while(r<n){
            if(nums[r] == 0){
                count++;
            }
            r++;

            while(count > k){
                if(nums[l] == 0){
                    count--;
                }
                l++;
            }
            max = Math.max(max,r-l);
            

        }
        return max;
        
        
    }
}