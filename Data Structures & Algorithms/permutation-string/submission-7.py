class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        d1 = {}
        d2 = {}
        for i in s1:
            d1[i] = d1.get(i, 0) + 1
        # permutations - order matters
        k = len(s1)
        i = 0
        for j in range(len(s2)):
            
            d2[s2[j]] = d2.get(s2[j], 0) + 1
            if j - i + 1 == k:
                d2 = self.del_zero_entry(d2, s2)
                if d1 == d2:
                    return True        
                else:
                    d2[s2[i]]-=1
                print(d1, d2)
                i+=1
            
        return False

    def del_zero_entry(self, d: dict(), s: str) -> dict():
        for i in s:
            if i in d and d[i] == 0:
                del d[i]
        return d

        