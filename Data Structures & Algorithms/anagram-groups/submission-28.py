class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # group strs by canonical key
        groups = {}
        for s in strs:
            freq_arr = [0] * 26
            canon = ""
            for c in s:
                freq_arr[ord(c) - ord('a')]+=1
                canon = str(freq_arr)
            if canon in groups:
                groups[canon].append(s)
            else:
                groups[canon] = [s]
        return list(groups.values())
