class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        for (int i = 0; i<nums.length; i++){
            for(int j =0; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        return new int[] {b,a};
    }
}
