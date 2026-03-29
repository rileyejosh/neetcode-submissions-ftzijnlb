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
                
                # the most characters we can replace
                # is determined by the max freq
                # so if we subtract max freq from
                # the length of the subarray
                # we can get the number of replacements
                # if that number is less than or equal to k
                if (j-i+1) - max_freq  <= k:
                    # then we can use the subarray
                    # so get its length
                    max_len = max(max_len, (j-i+1))
        return max_len
