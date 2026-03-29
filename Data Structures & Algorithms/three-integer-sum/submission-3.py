class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        hm = {}
        l = set()
        for i in range(len(nums)):
            hm[nums[i]] = i
        
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i != j:
                    numK = abs(nums[i] + nums[j])
                    if numK in hm: 
                        if hm[numK] != i and hm[numK] != j and nums[i] + nums[j] + numK == 0:
                            l.add(tuple(sorted([nums[i], nums[j], numK])))
        return list(l)
        