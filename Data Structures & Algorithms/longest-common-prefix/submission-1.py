class Solution:
    # ["bat","bag","bank","band"]
    # edge cases: first word can be longer or shorter than other strings
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""
        strs_len = len(strs)
        first_str = strs[0]
        strs.pop(0)
        for i in range(len(first_str)):
            c = first_str[i]
            for j in strs:
                # edge case: if index is out of range, return 
                if i >= len(j) or j[i] != c:
                    return res
            res+=c
        return res   



