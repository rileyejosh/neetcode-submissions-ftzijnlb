class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
       # since array is sorted
       # use two pointers 
       # one pointer on the left side
       # other pointer on the right side
       l = 0 
       r = len(numbers)-1
       
       while l < r:
        # determine the sum of l and r
        res = numbers[l] + numbers[r]

        # if the sum is greater than target
        # shift r to the left
        if res > target:
            r -= 1
        # if the sum is less than target
        # shift l to the right
        elif res < target:
            l +=1
        else:
            return [l+1, r+1]


       