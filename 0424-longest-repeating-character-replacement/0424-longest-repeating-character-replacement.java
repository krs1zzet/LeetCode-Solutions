class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];   

        int left = 0;
        int maxCountInWindow = 0;  
        int ans = 0;

        for (int right = 0; right < n; right++) {
            int idx = s.charAt(right) - 'A';
            freq[idx]++;
            maxCountInWindow = Math.max(maxCountInWindow, freq[idx]);
            while ((right - left + 1) - maxCountInWindow > k) {
                int leftIdx = s.charAt(left) - 'A';
                freq[leftIdx]--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
