class Solution {
    public int maxProduct(int[] nums) {
        int best = nums[0];
        for(int i = 0 ; i<nums.length ; i++){
            int product = nums[i];
            if(product>best){
                best = product;
            }
            for(int j = i+1 ; j<nums.length ; j++){
                product *= nums[j];
                if(product>best){
                    best = product;
                }
            }
        }
        return best;
        
    }
}


