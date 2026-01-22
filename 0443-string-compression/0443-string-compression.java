class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n <= 1) return n;

        int write = 0;   
        int count = 1;   

        for (int i = 1; i <= n; i++) {
            if (i < n && chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[write++] = chars[i - 1];

                if (count > 1) {
                    String num = String.valueOf(count);
                    for (int j = 0; j < num.length(); j++) {
                        chars[write++] = num.charAt(j);
                    }
                }
                count = 1;
            }
        }
        return write;
    }
}
