class Solution {
    public int alternatingSubarray(int[] nums) {

        int n = nums.length;
        int maxCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int count = 1;          
            boolean expectPlus = true; 

            for (int j = i + 1; j < n; j++) {
                int diff = nums[j] - nums[j - 1];

                if (expectPlus && diff == 1) {
                    count++;
                    expectPlus = false;
                }
                else if (!expectPlus && diff == -1) {
                    count++;
                    expectPlus = true;
                }
                else {
                    break; 
                }
            }

            if (count > 1) {
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount == 0 ? -1 : maxCount;
    }
}
