class Solution {
    public int countPaths(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        Set<List<Integer>> visit = new HashSet<>();        

        return dfs(0, 0, ROWS, COLS, visit, grid);

    }

    private int dfs(int r, int c, int ROWS, int COLS, Set<List<Integer>> visit, int[][] grid) {

        if(Math.min(r, c) < 0 || r == ROWS || c == COLS
            || visit.contains(Arrays.asList(r,c)) || grid[r][c] == 1) return 0;

        if(r == (ROWS - 1) && c == (COLS - 1)) return 1;
        System.out.println(Arrays.asList(r,c));
        visit.add(Arrays.asList(r,c));
        int count = 0;
        count += dfs(r+1, c, ROWS, COLS, visit, grid);
        count += dfs(r-1, c, ROWS, COLS, visit, grid);
        count += dfs(r, c+1, ROWS, COLS, visit, grid); 
        count += dfs(r, c-1, ROWS, COLS, visit, grid);
        
        visit.remove(Arrays.asList(r,c));

        return count;



    }
}
