class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean}
     */
    isValidSudoku(board) {
        let ROW = 9;
        let COL = 9;
        let boardSet = new Set();
        /*
            Edge cases:
            1) Empty cells can cause logic to return false
                if duplicate empty spaces detected in boardSet
            2) Clear set after each inner loop finishes, to prevent
                finding duplicates from previous inner loops

        */
        for(let i = 0; i < ROW; i++) {
            for(let j = 0; j < COL; j++) {
                if(boardSet.has(board[i][j]))
                    return false;
                else {
                       if(board[i][j] !== ".")
                            boardSet.add(board[i][j]);
                }
            }
            boardSet.clear();
        }
        boardSet = new Set();
        for(let i = 0; i < ROW; i++) {
            for(let j = 0; j < COL; j++) {
                if(boardSet.has(board[j][i]))
                    return false;
                else {
                            if(board[j][i] !== ".")
                                boardSet.add(board[j][i]);
                }
                
            }
            boardSet.clear();
        }
        boardSet = new Set();
        for(let i = 0; i < ROW; i+=3) {
            for(let j = 0; j < COL; j+=3) {
                for(let n = i; n < i+3; n++ ) {
                    for(let m = j; m < j+3; m++) {
                        if(boardSet.has(board[n][m])) 
                            return false;
                        else {
                            if(board[n][m] !== ".")
                                boardSet.add(board[n][m]);
                        }
                 }
                }
                boardSet.clear();
            }
        }



        return true;
        
    }
}
