class Solution {
    private StringBuilder sb = new StringBuilder();

    public boolean exist(char[][] board, String word) {
        int ROWS = board.length, COLS = board[0].length;
        sb = new StringBuilder();
        Set<List<Integer>> visit = new HashSet<>();
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                
                if(dfs(board, word, visit, i, j, 0, ROWS, COLS)) return true;
            }
        }
        return false;
                

    }

   private boolean dfs(char[][] board,  String word, Set<List<Integer>> visit, int r, int c, int index, int ROWS, int COLS) {
    // Base cases
    if (index == word.length()) return true; // Found the entire word
    if (r < 0 || r >= ROWS || c < 0 || c >= COLS || // Out of bounds
        visit.contains(Arrays.asList(r, c)) || // Already visited
        board[r][c] != word.charAt(index)) { // Mismatched character
        return false;
    }

    // Mark current cell as visited
    visit.add(Arrays.asList(r, c));

    // Explore all four directions
    boolean found = dfs(board, word, visit, r+1, c, index+1,ROWS, COLS) || // Down
                   dfs(board, word, visit, r-1, c, index+1, ROWS, COLS) || // Up
                   dfs(board, word, visit, r, c+1, index+1, ROWS, COLS) || // Right
                   dfs(board, word, visit, r, c-1, index+1, ROWS, COLS);   // Left

    // Backtrack: unmark the current cell
    visit.remove(Arrays.asList(r, c));

    return found;
}
}
