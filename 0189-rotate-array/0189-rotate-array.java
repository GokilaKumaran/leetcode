class Solution {
    public void rotate(int[] nums, int k) {
   
        int n = nums.length;
        k = k % n;  // Make sure k is within the array length
        int[] temp = new int[n]; // Temporary array

        // Copy elements to the new array in rotated order
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}

    