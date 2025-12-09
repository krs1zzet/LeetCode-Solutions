class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int flag = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] % 2 == 0){
                flag++;
            }
        }
        if(flag >=2){
            return true;
        }
        return false;
        
    }
}