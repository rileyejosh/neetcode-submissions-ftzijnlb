class Solution {
    public int uniquePaths(int m, int n) {
        int ROWS = m, COLS = n;
        int[][] cache = new int[m][n];
        return memoization(0, 0, ROWS, COLS, cache);

    }

    private int memoization(int r, int c, int ROWS, int COLS, int[][] cache ) {
        if(r == ROWS || c == COLS)
            return 0;
        if(r == ROWS-1 && c == COLS-1)
            return 1;
        if(cache[r][c] > 0) 
            return cache[r][c];
        
        cache[r][c] = memoization(r+1, c, ROWS, COLS, cache) 
                + memoization(r, c+1, ROWS, COLS, cache);

        return cache[r][c];


    }
}
