class Solution {
    public String thousandSeparator(int n) {
       
        if (n < 1000) return String.valueOf(n);

        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (n > 0) {
            if (count == 3) {
                sb.append('.');
                count = 0;
            }
            sb.append(n % 10);
            n /= 10;
            count++;
        }

        return sb.reverse().toString();
    }
}
