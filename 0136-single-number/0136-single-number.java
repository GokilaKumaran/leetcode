class Solution {
    public int singleNumber(int[] nums) {
       Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                // If add() returns false, the element was already in the set, so remove it.
                seen.remove(num);
            }
        }
        // The remaining element is the single one.
        return seen.iterator().next();
    }
}