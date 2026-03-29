class Solution:
    # ["act","pots","tops","cat","stop","hat"]
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm = {}
        res = []
        # O(n*m)
        for s in strs:
            freq = [0] * 26
            for j in range(len(s)):
                freq[ord(s[j]) - ord('a')]+=1
            freq_str = ",".join(map(str, freq))
            print(freq_str)
            if freq_str not in hm:
                hm[freq_str] = [s]
            else:
                hm[freq_str].append(s)
        for k in hm:
            res.append(hm[k])
        return res
        
        



        