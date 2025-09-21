class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int maxSoFar = nums[0];      // Max product ending at current position
        int minSoFar = nums[0];      // Min product ending at current position (for handling negatives)
        int result = nums[0];        // Result to keep track of max product found
        
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            // When multiplied by a negative number, max becomes min and min becomes max
            if (curr < 0) {
                // Swap maxSoFar and minSoFar
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            
            // Calculate max and min product ending at current index
            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);
            
            // Update the result if we found a bigger product
            result = Math.max(result, maxSoFar);
        }
        
        return result;
    }
}