class Solution {
    public boolean exist(char[][] board, String word) {
         int m = board.length;
        int n = board[0].length;

        // For each cell in the board, try to find the word starting from that cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // If all characters are matched
        if (index == word.length()) {
            return true;
        }

        // Check boundaries and if current cell matches the word character
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length 
            || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark the cell as visited by temporarily changing the character
        char temp = board[i][j];
        board[i][j] = '#'; // '#' marks visited

        // Explore all 4 directions
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);

        // Restore the original character after exploration
        board[i][j] = temp;

        return found;
        
    }
}