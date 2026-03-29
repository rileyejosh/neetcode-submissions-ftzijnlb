class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS = len(matrix)
        COLS = len(matrix[0])

        for i in range(ROWS):
            l = 0
            r = COLS - 1
            while l <= r:
                mid = (r+l)//2
                if matrix[i][mid] == target:
                    return True
                elif matrix[i][mid] > target:
                    r = mid - 1 
                else:
                    l = mid + 1
        return False

                
                    
                