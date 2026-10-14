class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i!=j and nums[i] + nums[j] == target:
                    if len(res) == 2:
                        break
                    else:
                        res.append(i)
                        res.append(j)
        return res
        