class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> countMap = new HashMap<>();
        int result = 0;

        for (int[] d : dominoes) {
            int a = d[0];
            int b = d[1];

            int min = Math.min(a, b);
            int max = Math.max(a, b);
            String key = min + "," + max;

            result += countMap.getOrDefault(key, 0);

            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }

        return result;
    }
}