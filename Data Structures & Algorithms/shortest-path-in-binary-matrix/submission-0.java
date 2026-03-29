class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int N = grid.length;
        if (grid[0][0] == 1 || grid[N - 1][N - 1] == 1) return -1;
        boolean[][] visit = new boolean[N][N];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,1});
        visit[0][0] = true;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0},
                        {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        while(!q.isEmpty()) {
           int[] coords = q.poll();
           int row = coords[0], col = coords[1], length = coords[2];
           if(row == N-1 && col == N-1) return length;

           for(int[] direction : directions) {
            int newR = row + direction[0], newC = col + direction[1];
            if(newR >= 0 && newC >= 0 && newR < N && newC < N && grid[newR][newC] == 0
                && !visit[newR][newC]) {
                    q.offer(new int[]{newR,newC, length+1});
                    visit[newR][newC] = true;
                }

           }

        } 
        return -1;

    }
}