class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        # permutations - order matters
        k = len(s1)
        for i in range(len(s2)):
            for j in range(i, len(s2)):
                if j - i + 1 == k:
                    if self.sort_str(s2[i:j+1]) == self.sort_str(s1):
                        return True
        return False

    def sort_str(self, s: str) -> str:
        sorted_string = "".join(sorted(s))
        return sorted_string

        