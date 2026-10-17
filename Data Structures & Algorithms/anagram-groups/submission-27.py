class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # group keys by canonical key
        groups = {}
        for s in strs:
            canon = "".join(sorted(s))
            if canon in groups:
                groups[canon].append(s)
            else:
                groups[canon] = [s]
        return list(groups.values())
