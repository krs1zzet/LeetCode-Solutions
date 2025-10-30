import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        Map<Character, Integer> lastPos = new HashMap<>();
        int left = 0;          
        int max = 0;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            if (lastPos.containsKey(c)) {
                left = Math.max(left, lastPos.get(c) + 1);
            }

            lastPos.put(c, right);

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
