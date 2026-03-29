class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        top = 0
        bottom = len(matrix)-1

        while top <= bottom:
            mid_row = (top + bottom) // 2
            # target not in mid row or rows before it
            if target < matrix[mid_row][0]:
                bottom = mid_row - 1
            # target not in mid row or subsequent rows
            elif target > matrix[mid_row][len(matrix[mid_row])-1]:
                top = mid_row + 1
            # target is within range of mid row
            else: 
                left = 0
                right = len(matrix[mid_row])-1
                while left <= right:
                    mid = (left+right)//2
                    if target == matrix[mid_row][mid]:
                        return True
                    elif target > matrix[mid_row][mid]:
                        left = mid + 1
                    else:
                        right = mid - 1
                return False
        return False

                
                    
                