class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i < rows; i++) {
            char[] row = board[i];
            for(int j = 0; j < row.length; j++) {
                if(row[j] != '.') {
                    if(!set.add(Character.valueOf(row[j])) ) {
                        return false;
                    }
                }
            }
            set.clear();
        }
        set.clear();

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if (board[row][col] != '.') {
                    if (!set.add(board[row][col])) {
                        return false;
                    }
                }
            }
            set.clear();
        }

        set.clear();
        
        for (int i = 0; i < rows; i += 3) {
            for (int j = 0; j < cols; j += 3) {
                for (int n = i; n < i + 3; n++) {
                    for (int m = j; m < j + 3; m++) {
                        System.out.print(board[n][m] + " ");
                        if (board[n][m] != '.') {
                            if (!set.add(board[n][m]))
                                return false;
                        }
                    }
                    System.out.println();
                }
                set.clear();
            }

        }



        return true;
    }
}
