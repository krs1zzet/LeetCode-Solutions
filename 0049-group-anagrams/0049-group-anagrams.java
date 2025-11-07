class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) return result;

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);          
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        result.addAll(map.values());
        return result;
    }



}