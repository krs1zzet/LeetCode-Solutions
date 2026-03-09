class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n ; i++){
            result[nums[i]]++;
        }
        for(int i = 0 ; i< n ; i++){
            if(result[i]>1){
                return i;
            }
        }
        return -1;
        
    }
}