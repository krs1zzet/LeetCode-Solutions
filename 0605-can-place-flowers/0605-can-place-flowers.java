class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        if(len == 0){
            return false;
        }
        if(n == 0 ){
            return true;
        }

        for(int i = 0 ; i < len ; i++){

            if(flowerbed[i] == 0){
                int left = (i==0) ? 0 : flowerbed[i-1];
                int right = (i == len - 1 ) ? 0 : flowerbed[i+1];

                if(left == 0 && right == 0){
                    flowerbed[i] =1;
                    count++;
                }
            }


        }
        
    return (count >= n) ? true : false;
        
    }
}