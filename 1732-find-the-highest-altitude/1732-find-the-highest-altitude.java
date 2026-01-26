class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int total = 0;
        int result = 0;

        for(int i = 0 ; i < n ; i++){
            total+= gain[i];
            result = Math.max(total,result);
        }

        return result;
        
    }
}