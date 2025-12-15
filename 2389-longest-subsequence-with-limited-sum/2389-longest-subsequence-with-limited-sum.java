import java.util.*;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            answer[i] = upperBound(nums, queries[i]);
        }

        return answer;
    }

    private int upperBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                res = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
