class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        f = 0
        s = 0

        while True:
            f = nums[nums[f]]
            s = nums[s]
            if nums[f] == nums[s]:
                print(f, s)  
                break
        s2 = 0
        while True:
            s2 = nums[s2]
            s = nums[s]
            if s2 == s:
                break
        return s  