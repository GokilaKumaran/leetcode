class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            // Found a combination that adds up to target
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            // Exceeded the target, stop exploring this path
            return;
        }

        // Try all candidates starting from 'start' index
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);  // choose
            backtrack(candidates, target - candidates[i], i, current, result);  // explore
            current.remove(current.size() - 1);  // un-choose (backtrack)
        }
    }

    
}