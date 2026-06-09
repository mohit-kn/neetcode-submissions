class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> abc = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            abc.put(nums[i],i);
        }

        for (int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(abc.containsKey(diff) && abc.get(diff) != i){
                return new int[] {i, abc.get(diff)};
            }
        }
        return new int[0];
    }
}
