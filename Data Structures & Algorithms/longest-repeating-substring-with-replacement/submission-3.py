class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        max_len = 0
    
        for i in range(len(s)):
            freq, max_freq = {}, 0
            for j in range(i, len(s)):
                # get frequency of each character in the subarray
                freq[s[j]] = 1 + freq.get(s[j], 0)
                # get the max frequency
                max_freq = max(max_freq, freq[s[j]])
                
                if (j-i+1) - max_freq  <= k:
                    max_len = max(max_len, (j-i+1))
        return max_len
