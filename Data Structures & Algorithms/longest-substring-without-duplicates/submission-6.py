class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len = 0
        L = 0
        hs = set()
        for R in range(len(s)):
            while s[R] in hs:
                hs.discard(s[L])
                L += 1
            hs.add(s[R])
            max_len = max(max_len, R - L + 1)
        return max_len






