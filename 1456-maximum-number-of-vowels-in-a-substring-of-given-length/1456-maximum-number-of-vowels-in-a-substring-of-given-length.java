class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int result = Integer.MIN_VALUE;
        int count = 0;
        int r = 0;

        for (r = 0; r < k; r++) {
            if (isVowel(s.charAt(r))) {
                count++;
            }
        }
        result = Math.max(result,count);

        for (int l = 0; l < n-k; l++) {
            if (isVowel(s.charAt(r))) {
                count++;
            }
            if(isVowel(s.charAt(l))){
                count--;
            }
            result = Math.max(result,count);
            r++;

        }
        return result;

    }

    private Boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}