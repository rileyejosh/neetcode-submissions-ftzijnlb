class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        

        # check rows
        for i in range(9):
            s = set()
            r = board[i]
            for j in range(9):
                if r[j] != "." and r[j] in s:
                    return False
                s.add(r[j]) 

        # check columns
        for c in range(9):
            s = set()
            for r in range(9):
                e = board[r][c]
                if e != "." and e in s:
                    return False
                s.add(e)

        # check 3 x 3 sub-boxes
        for i in range(0, 9, 3):
            for j in range(0, 9, 3):
                s = set()
                for n in range(i, i+3):
                    for m in range(j, j+3):
                        if board[n][m] != ".":
                            if board[n][m] in s:
                                return False
                            s.add(board[n][m])
                

        return True




        