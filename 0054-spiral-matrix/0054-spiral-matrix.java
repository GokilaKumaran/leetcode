class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) return result;
        
        int m = matrix.length;       // number of rows
        int n = matrix[0].length;    // number of columns
        
        int top = 0;                 // top row boundary
        int bottom = m - 1;          // bottom row boundary
        int left = 0;                // left column boundary
        int right = n - 1;           // right column boundary
        
        while (top <= bottom && left <= right) {
            // Traverse from left to right on the top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // Move down to the next row
            
            // Traverse from top to bottom on the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Move left to the next column
            
            if (top <= bottom) {
                // Traverse from right to left on the bottom row
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // Move up to the previous row
            }
            
            if (left <= right) {
                // Traverse from bottom to top on the left column
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move right to the next column
            }
        }
        
        return result;
    }
}