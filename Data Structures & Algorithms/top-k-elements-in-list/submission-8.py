class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
       freq = {}
       for n in nums:
        freq[n] = 1 + freq.get(n,0) # provides a way to handle cases 
                                     # where the key might not exist 
                                     # without raising a KeyError
       
       count = [[] for _ in range(len(nums) + 1)] # frequency of 
                                              # nums can't be greater than n
       for num, f in freq.items():
        count[f].append(num)

       res = []
       for i in range(len(count) -1, 0, -1):
        res.extend(count[i])
        if len(res) == k: # break if output list is size k
            break

       return res



                    