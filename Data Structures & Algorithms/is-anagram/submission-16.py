class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # sorted_t = "".join(sorted(t))
        # sorted_s = "".join(sorted(s))
        smap = {}
        tmap = {}
        if len(s) != len(t):
            return False
        for c in s:
            if c not in smap:
                smap[c] = 1
            else:
                smap[c] += 1
        for c in t:
            if c not in tmap:
                tmap[c] = 1
            else:
                tmap[c] += 1
        for c in s:
            if c not in tmap:
                return False
            if tmap[c] != smap[c]:
                return False
        return True