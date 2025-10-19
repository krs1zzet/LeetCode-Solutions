class Solution {
    public int[] runningSum(int[] nums) {

        int total = 0;
        for (int x : nums) total += x;

        int n = nums.length;
        int[] arr = new int[n];

        int right = 0;
        for(int i = n-1 ; i>=0 ; i--){
            arr[i] = total - right;
            right+= nums[i];
        }
        return arr;
        
    }
}