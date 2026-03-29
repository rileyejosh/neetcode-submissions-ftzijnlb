class Solution {
    public int orangesRotting(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        int time = 0, freshFruit = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                if(grid[i][j] == 2) {
                    q.offer(new int[]{i,j});
                
                }
                else if(grid[i][j] == 1) freshFruit++;
            }
        }
        if(q.isEmpty() && freshFruit == 0) return 0;
        int[][] directions = new int[][] {{1, 0}, {-1, 0}, {0,1}, {0, -1}};
        while(!q.isEmpty()) {
            int qLen = q.size();
            for(int i = 0; i < qLen; i++) {
                int[] cell = q.poll();
                int r = cell[0], c = cell[1];

                for(int[] dir : directions) {
                    int newR = r + dir[0], newC = c + dir[1];
                    if(Math.min(newR, newC) < 0 ||
                            newR >= ROWS || newC >= COLS ||
                            grid[newR][newC] == 0 || 
                            grid[newR][newC] == 2) continue;
                        
                        grid[newR][newC] = 2;
                        q.offer(new int[]{newR, newC});      
                        freshFruit--;
                    }
                    
            }
            time++;
        }

        return freshFruit == 0 ? (time-1) : -1;

    }
}
