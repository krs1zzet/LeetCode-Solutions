class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int threshold = n / 4;
        
        int count = 1;
        int val = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == val) {
                count++;
                if (count > threshold) {
                    return val;
                }
            } else {
                val = arr[i];
                count = 1;
            }
        }

        return val;
    }
}
