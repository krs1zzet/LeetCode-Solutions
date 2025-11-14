class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int n = answerKey.length();
        int[] freq = new int[26];
        int left = 0;
        int ans = 0;
        int maxNum = 0;

        for(int right = 0 ; right<n ; right++){
            int index = answerKey.charAt(right) - 'A';
            freq[index]++;

            maxNum = Math.max(maxNum,freq[index]);

            while((right - left + 1) - maxNum > k){
                int leftIdx = answerKey.charAt(left) - 'A';
                freq[leftIdx]--;
                left++;
            }
        ans = Math.max(ans, right - left + 1);

            
        }
        return ans;
        
    }
}
