class Solution:
    def findMin(self, nums: List[int]) -> int:
      l = 0
      r = len(nums)-1
      while l < r:
        m = (l+r)//2
        # if mid value is greater than upper bound
        # then min must be on the right side of mid
        # since the smaller values are on the right side 
        if nums[m] > nums[r]:
          l = m + 1
        else:
        # if mid value is less than the upper bound
        # then min must be either mid or on the left side of mid
          r = m

      return nums[l]
        

        