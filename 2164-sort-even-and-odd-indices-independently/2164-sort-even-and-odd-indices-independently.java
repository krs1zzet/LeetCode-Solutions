class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;

        if(n<2){
            return nums;
        }

        List<Integer> evenList = new ArrayList<>();

        List<Integer> oddList = new ArrayList<>();

        
        for(int i = 0 ; i < n ; i++){
            if( i%2 == 0) {
                evenList.add(nums[i]);
            }
            else{
                oddList.add(nums[i]);
            }
        }

        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());

        int e=0;
        int o=0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = evenList.get(e++);
            } else {
                nums[i] = oddList.get(o++);
            }
        }
        return nums;
        
    }
}