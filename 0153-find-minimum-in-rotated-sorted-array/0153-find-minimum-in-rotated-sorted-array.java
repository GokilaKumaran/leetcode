class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than right, min must be in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Min is in the left half (including mid)
                right = mid;
            }
        }

        // left == right -> min element
        return nums[left];
    }
}