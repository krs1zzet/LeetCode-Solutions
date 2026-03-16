class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        Set<String> pos = new HashSet<>(Arrays.asList(positive_feedback));
        Set<String> neg = new HashSet<>(Arrays.asList(negative_feedback));

        int n = report.length;
        List<int[]> scores = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            int score = 0;
            String[] words = report[i].split(" ");

            for(String w : words){
                if(pos.contains(w)) score+=3;
                else if(neg.contains(w)) score-=1;
            }
            scores.add(new int[]{score, student_id[i]});
        }

        Collections.sort(scores,(a,b) -> {
            if(a[0] != b[0])
                return b[0] - a[0];
            return a[1]-b[1];
        });

        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < k ; i++){
            result.add(scores.get(i)[1]);
        }
        return result;

        
    }
}