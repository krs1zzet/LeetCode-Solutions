class Solution {
    public boolean isPalindrome(int x) {
        // Negatif sayılar palindrome değildir
        if (x < 0) {
            return false;
        }

        String s = Integer.toString(x);
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
