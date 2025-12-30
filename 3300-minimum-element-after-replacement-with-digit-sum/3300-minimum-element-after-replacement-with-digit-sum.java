class Solution {
    public int minElement(int[] nums) {

        int n = nums.length;
        int val = 0;

        for(int i = 0 ; i < n ; i++){
            while(nums[i]>0){
                val+=nums[i]%10;
                nums[i]/=10;
            }
            nums[i] = val;
            val = 0;
        }
        Arrays.sort(nums);
        return nums[0];

        
    }
}