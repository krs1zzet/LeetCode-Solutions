class Solution {
    public long numberOfWeeks(int[] milestones) {
        int n = milestones.length;
        long val = 0;
        int max = milestones[0];
        int maxIndex =0;

        for(int i = 0 ; i < n ; i++){
            if(max < milestones[i]){
                max = milestones[i];
                maxIndex =i;
            }            
        }
        milestones[maxIndex] =0;

        for(int i = 0 ; i < n ; i++){
             val += milestones[i];
        }      

        if(max > val){
            return  (val+val+1);
        }
        else{
            return (val + max);
        }
    }
}