class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
     List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // start from smallest lex order

        // Add the first (sorted) permutation
        result.add(toList(nums));

        while (nextPermutation(nums)) {
            result.add(toList(nums));
        }

        return result;
    }

    // Helper: convert array to list
    private List<Integer> toList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);
        return list;
    }

    // Generate the next lexicographical permutation, return false if no next permutation
    private boolean nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // Find first decreasing element from right
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i < 0) return false;  // Last permutation reached

        // Find element just larger than nums[i]
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) j--;

        // Swap
        swap(nums, i, j);

        // Reverse suffix starting at i+1
        reverse(nums, i + 1);

        return true;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}