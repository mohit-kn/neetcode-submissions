class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> rev = new HashMap<>();
        for(String c : strs){
            char[] carr = c.toCharArray();
            Arrays.sort(carr);
            String scarr = new String(carr);

            rev.putIfAbsent(scarr, new ArrayList<>());
            rev.get(scarr).add(c);
        }
        return new ArrayList<>(rev.values());
    }
}
