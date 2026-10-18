class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        topK =  []
        for i in nums:
            if i not in freq:
                freq[i] = 1
            else:
                freq[i] += 1
        max_freq = dict(sorted(freq.items(), key=lambda item: item[1], reverse=True))
        keys = list(max_freq.keys())
        for i in range(k):
            topK.append(keys[i])
        return topK



    

        