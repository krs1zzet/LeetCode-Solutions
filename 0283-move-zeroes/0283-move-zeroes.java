class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int numIndex=0;
        
    if(n > 1){

    
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                numIndex=i;
                while(nums[numIndex]==0 && numIndex < n-1){
                    numIndex++;
                }
                nums[i] = nums[numIndex];
                nums[numIndex] = 0;
                
            }
        }
    
}
        
    }
}