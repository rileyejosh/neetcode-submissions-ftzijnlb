class Solution:
    hm = {}
    # use the join function
    def encode(self, strs: List[str]) -> str:
        words = []
        for i in range(len(strs)):
            words.append(strs[i])
            self.hm[i] = strs[i]
        encoded_str = "".join(words)
        return encoded_str
        

    def decode(self, s: str) -> List[str]:
        res = []
        for i in range(len(self.hm)):
            res.append(self.hm[i]);
        self.hm.clear()
        return res
        





