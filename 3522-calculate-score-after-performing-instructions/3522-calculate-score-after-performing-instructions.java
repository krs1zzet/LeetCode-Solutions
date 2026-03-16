class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n = values.length;
        boolean[] visited = new boolean[n];

        int currIndex =0;
        long score =0;


        while((currIndex < n )&& (currIndex >=0) && !visited[currIndex] ){
            visited[currIndex] = true;
            if(instructions[currIndex].charAt(0) == 'j'){
                    currIndex = currIndex+values[currIndex];
                }
            else{
                score+=values[currIndex];
                currIndex = currIndex+1;
            }
            
        }
        return score;
        
    }

    
}