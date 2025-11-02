class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        for(int i = 0 ; i<n ; i++){
            int currentTotal=1;
                
            for(int j = i ; j < n ; j++){
                currentTotal *=nums[j];
                if(currentTotal >= k){
                    j=n;
                }
                else{
                    total++;
                }
            }
        }
        return total;
        
    }
}