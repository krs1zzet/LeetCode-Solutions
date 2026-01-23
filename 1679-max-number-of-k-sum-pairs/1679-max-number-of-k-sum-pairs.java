class Solution {
    public int maxOperations(int[] nums, int k) {
    int n = nums.length;
    int right = n-1;
    int left = 0;
    int count = 0;
    Arrays.sort(nums);
    while (left < right){
        if(nums[left] + nums[right] == k){
            count++;
            left++;
            right--;

        }
        if(nums[left] + nums[right]>k){
            right--;
        }
        if(nums[left] + nums[right]<k){
            left++;
        }

    }

    return count;
        
    }
}