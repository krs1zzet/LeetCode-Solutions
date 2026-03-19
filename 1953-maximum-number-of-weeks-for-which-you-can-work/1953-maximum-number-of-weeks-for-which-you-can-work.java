class Solution {
    public long numberOfWeeks(int[] milestones) {
        int n = milestones.length;
        long val = 0;

        Arrays.sort(milestones);
        for(int i = 0 ; i < n-1 ; i++){
             val += milestones[i];
        }      

        if(milestones[n-1] > val){
            return  (val+val+1);
        }
        else{
            return (val + milestones[n-1]);
        }
    }
}