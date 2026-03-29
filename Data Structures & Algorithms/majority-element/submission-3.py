class Solution:
    def majorityElement(self, nums: List[int]) -> int:
       hm = {}
        
       for n in nums:
        if n not in hm:
            hm[n] = 1
        else:
            hm[n]+=1
       
       m = nums[0]
       for k in hm:
        if hm[k] == hm[m]:
            if k > m:
                m = k
        if hm[k] > hm[m]:
                m = k
       return m
