class Solution {
    static int lcs(int m , int n, String text1, String text2,int[][] memo){

        if(m == 0 || n == 0){
            return 0;
        }

        if(memo[m][n] != -1){
            return memo[m][n];
        }

        if(text1.charAt(m-1) == text2.charAt(n-1)){
            return memo[m][n] =
                1 + lcs(m-1,n-1,text1,text2,memo);
        }
        return memo[m][n] =
            Math.max(
                lcs(m,n-1,text1,text2,memo),
                lcs(m-1,n,text1,text2,memo)
                );


    }
    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        int[][] memo = new int[m+1][n+1];

        for (int i = 0; i <=m; i++) {
            Arrays.fill(memo[i], -1);
        }

        return lcs(m , n , text1, text2, memo);
        
    }

    
}