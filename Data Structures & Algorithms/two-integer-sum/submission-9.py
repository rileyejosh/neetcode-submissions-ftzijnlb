class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = []
        hm = {}
        for i in range(len(nums)):
            hm[nums[i]] = i
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in hm and hm[complement] != i:
                res.append(min(hm[complement],i))
                res.append(max(hm[complement], i))
                break
        return res
        