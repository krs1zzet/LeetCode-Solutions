class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int[] result = new int[n];
        List<Integer> zeros = new ArrayList<Integer>();

        for (int i = 0 ; i<n ; i++ ){
            if(nums[i]!=0){
            prod*=nums[i];
            }
            else{
                zeros.add(i);
            }
        }
        
        for(int i  = 0 ; i < n ; i++){
            if(zeros.size()>0){
                if(nums[i] != 0){
                result[i] = 0;
            }
            else{
                if(zeros.size()>1){
                    result[i] = 0;
                }
                else{
                    result[i] = prod;
                }

            }
            }
            else{
                result[i] = prod/nums[i];

            }


        }
        return result;

        
        
    }
}