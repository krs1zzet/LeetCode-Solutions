class Solution {
    public int maxArea(int[] height) {
        int currentMax = 0;
        int n = height.length;
        int right = n-1;
        int left = 0;

        while(left < right){
            int current = 0;
            int width = right-left;

            if (height[right] >= height[left]) {
                int t = height[left] * width;
                if (currentMax < t) {
                    currentMax = t;
                }
                left++;
            } else {
                int t = height[right] * width;
                if (currentMax < t) {
                    currentMax = t;
                }
                right--;
            }



        }
        return currentMax;
        
    }
}