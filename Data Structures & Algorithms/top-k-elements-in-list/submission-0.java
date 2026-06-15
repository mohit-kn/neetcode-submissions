class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> somes = new HashMap<>();
        for(int i: nums){
            somes.put(i, somes.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> val = new ArrayList<>(somes.entrySet());
        val.sort((a,b) -> b.getValue() - a.getValue());

        int[] res = new int[k];
        for (int j =0; j<k; j++){
            res[j] = val.get(j).getKey();
        }
        return res;
    }
}
