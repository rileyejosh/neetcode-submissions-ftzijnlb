class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
      hm = {}
      res = []
      for i in range(len(nums)):
        hm[nums[i]] = i
      for j in range(len(nums)):
        com = target - nums[j]
        if com in hm and hm[com] != j:    
            res.append(min(hm[com], j))
            res.append(max(hm[com], j))
            break
      return res

