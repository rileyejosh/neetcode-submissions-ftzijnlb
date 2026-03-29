class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
      s = set(nums)
      max_len = 0
      i = 0
      while(i < len(nums)):
        n = nums[i]
        c = 1
        while n+1 in s:
            n+=1
            c+=1
        max_len = max(max_len, c)
        i+=1

      return max_len







        