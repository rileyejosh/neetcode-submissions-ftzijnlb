class Solution {
    private int maxArea = 0, count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                if(grid[i][j] == 1) {
                   dfs(grid, i, j, ROWS, COLS);
                   maxArea = Math.max(maxArea, count);
                   count = 0;
                }
            }
            
        }
        return maxArea;
    }

    private void dfs(int[][] grid, int r, int c, int ROWS, int COLS) {

        if(Math.min(r,c) < 0 || r == ROWS || c == COLS || 
            grid[r][c] == 0) return;
        
        count++;
        //System.out.println(String.format("%d, %d", r, c) + " " + count);
        grid[r][c] = 0;

        int[][] directions = new int[][] {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
        
        for(int[] direction : directions) {
            dfs(grid, r + direction[0], c + direction[1], ROWS, COLS);
        }
        
    }
}
