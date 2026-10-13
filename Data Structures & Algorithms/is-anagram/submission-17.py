class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # sorted_t = "".join(sorted(t))
        # sorted_s = "".join(sorted(s))
        smap = [0] * 26
        tmap = [0] * 26
        if len(s) != len(t):
            return False
        for c in s:
            smap[ord(c) - ord('a')]+=1
        for c in t:
            tmap[ord(c) - ord('a')]+=1
        
        return smap == tmap