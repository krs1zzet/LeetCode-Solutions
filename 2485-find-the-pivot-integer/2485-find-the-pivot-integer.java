class Solution {
    public int pivotInteger(int n) {
        int result = -1;
        int total = 0;
        for (int i = 1; i<=n ; i++){
            total+=i;
        }
        int num = 0;
        int right = 0;
        int left = 0;
        for(int i = 1 ; i<=n ; i++){
            left+=i;
            right = total-left+i;

            if((right-left) == 0){
                result = i;
            }
            
        }
        return result;
    }
}