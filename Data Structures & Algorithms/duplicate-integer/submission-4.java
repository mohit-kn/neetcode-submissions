class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashSet<Integer> seen = new HashSet<>(nums.length * 2);
    for (int n : nums) {
        if (!seen.add(n)) return true; // add() returns false if duplicate
    }
    return false;
}
}