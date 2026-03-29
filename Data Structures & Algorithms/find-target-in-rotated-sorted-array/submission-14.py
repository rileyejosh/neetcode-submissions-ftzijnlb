class Solution:
    def search(self, nums: List[int], target: int) -> int:
       l = 0
       r = len(nums) - 1
       while l <= r:
        m = (l+r)//2
        if nums[m] == target:
          return m
        # check if mid is greater than or equal to left
        elif nums[l] <= nums[m]:
          # the left side is sorted so check 
          # if the target is in range
          if target < nums[m] and target >= nums[l]:
            # target is in range so
            # the upper bound becomes
            # the value before mid
            r = m - 1
          else:
            # target is not in range
            # target must be on the right side
            # so the lower bound becomes the value
            # after mid
            l = m + 1
        else:
          # the right side is sorted so check
          # if the target is in range
          if target > nums[m] and target <= nums[r]:
            # target is in range 
            # so the value after mid becomes
            # lower bound
            l = m + 1
          else:
            # target is not in range
            # so the upper bound becomes
            # the value before mid
            r = m - 1
       return -1