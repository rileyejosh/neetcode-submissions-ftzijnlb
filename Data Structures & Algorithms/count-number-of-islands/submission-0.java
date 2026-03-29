class Solution {
    public int numIslands(char[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length, numOfIslands = 0;
        for(int r = 0; r < ROWS; r++) {
            for(int c = 0; c < COLS; c++) {
                if(grid[r][c] == '1') {
                    dfs(grid, r, c, ROWS, COLS);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }

    private void dfs(char[][] grid, int r, int c, int ROWS, int COLS ) {
        if(Math.min(r,c) < 0 || r == ROWS || c == COLS ||
            grid[r][c] == '0') return;
        grid[r][c] = '0';
        int[][] directions = new int[][] {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
        for(int[] dir : directions) {
            dfs(grid, r + dir[0], c + dir[1], ROWS, COLS);
        }
    }
}
