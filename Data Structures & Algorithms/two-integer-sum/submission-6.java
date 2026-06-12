class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> somes  = new HashMap<>();
        for ( int i=0; i<nums.length;i++){
            somes.put(nums[i],i);
        }
        for(int i=0; i<nums.length;i++){
            int diff = target-nums[i];
            if (somes.containsKey(diff) && somes.get(diff) != i ){
                return new int[] {i, somes.get(diff)};
            }
        }
        return new int[] {0};
    }
}