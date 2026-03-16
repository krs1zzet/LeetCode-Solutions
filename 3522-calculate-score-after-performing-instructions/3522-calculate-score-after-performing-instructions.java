class Solution {
    public long calculateScore(String[] instructions, int[] values) {

        Set<Integer> indexes = new HashSet<>();
        int currIndex =0;
        int n = values.length;
        long score =0;


        while(!indexes.contains(currIndex )&& (currIndex < n )&& (currIndex >=0)){
            indexes.add(currIndex);
            if(instructions[currIndex].equals("jump") ){
                    currIndex = currIndex+values[currIndex];
                }
            else if(instructions[currIndex].equals("add") ){
                    score+=values[currIndex];
                    currIndex = currIndex+1;
                }
        }
        return score;
        
    }

    
}