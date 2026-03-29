class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        
        max_len = 0
        for i in range(len(s)):
            d, max_freq = {}, 0
            for j in range(i, len(s)):
                d[s[j]] = d.get(s[j], 0) + 1
                max_freq = max(d.values())
                if abs((j - i + 1) - max_freq) <= k:
                    max_len = max((j - i + 1), max_len)
        return max_len

        