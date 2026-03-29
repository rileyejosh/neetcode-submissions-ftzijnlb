class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # variable sized sliding window
        L = 0
        max_len = 0
        # Edge Case: L doesn't track duplicate characters
        # at other indices in the substring
        hs = set() 
        for R in range(len(s)):
            while s[R] in hs:
                hs.remove(s[L])
                L+=1
            hs.add(s[R])
            max_len = max(max_len, R - L + 1)    
        return max_len
        