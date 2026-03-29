class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        
        max_len = 0
        d, max_freq = {}, 0
        i = 0
        for j in range(len(s)):
            d[s[j]] = d.get(s[j], 0) + 1
            max_freq = max(d.values())
            while abs((j - i + 1) - max_freq) > k:
                if d[s[i]] == 0:
                    del d[s[i]]
                d[s[i]]-=1
                max_freq = max(d.values())
                i+=1

            max_len = max(max_len, j - i + 1)
        return max_len

        