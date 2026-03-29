class Solution {
    public void setZeroes(int[][] matrix) {
        int ROWS = matrix.length, COLS = matrix[0].length;
        List<int[]> cells = new ArrayList<>();
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                if(matrix[i][j] == 0) cells.add(new int[]{i,j});
            }
        }   

        for(int[] cell : cells) {
            int row = cell[0], col = cell[1];
            // update rows
            for(int i = 0; i < ROWS; i++) {
                matrix[i][col] = 0;
            }
            // update columns
            for(int i = 0; i < COLS; i++) {
                matrix[row][i] = 0;
            }

        }
    }
}