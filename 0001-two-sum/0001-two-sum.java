class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                int x = nums[i] + nums[j];
                if(x==target){
                    return new int[]{i,j};
                }
            }
        }
                            return new int[]{};
    }
}