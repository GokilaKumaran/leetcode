class Solution {
    public int search(int[] nums, int target) {
         int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;  // Found the target
            }

            // Check which half is sorted
            if (nums[left] <= nums[mid]) {  // Left half is sorted
                // Check if target lies in the left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {  // Right half is sorted
                // Check if target lies in the right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;  // Target not found
    }
}